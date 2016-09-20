(ns helove.handlers.videos
  (:require [helove.tmpls :as tmpl]
            [clojure.java.io :as io]))

(defn show-videos [req]
  (tmpl/landing {:user-agent (get-in req [:headers "user-agent"])
                 :title "Vídeos"
                 :list (map #(.getName %) (file-seq (clojure.java.io/file "/home/jocelio/Videos/pocoyo/")))}))


;; (defn get-video [req]
;;   (tmpl/video {:title "Vídeos - >"
;;                :content-type "video/mp4"
;;                :list (slurpb (java.io.ByteArrayInputStream. (.getBytes "/home/jocelio/Videos/pocoyo/angra_-_nova-era.mp4"))) }))

(defn get-video [req]
(let [vid (get-in req [:path-params :video])]
  (print vid)
{:status 200
 :headers {"Content-Type" "video/mp4"}
 :body (java.io.File. (concat "/home/jocelio/Videos/pocoyo/" vid))}))

(let [f (java.io.File. "/home/jocelio/Videos/pocoyo/angra_-_nova-era.mp4")
      ary (byte-array (.length f))
      is (java.io.FileInputStream. f)]
  (.read is ary)
  (.close is)
  ary)
