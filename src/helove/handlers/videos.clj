(ns helove.handlers.videos
  (:require [helove.tmpls :as tmpl]
            [clojure.java.io :as io]))

(defn show-videos [req]
  (tmpl/landing {:user-agent (get-in req [:headers "user-agent"])
                 :title "Vídeos"
                 :list (map #(.getName %) (file-seq (clojure.java.io/file "/home/jocelio/Videos/pocoyo/")))}))

(defn play-video [video]
  (tmpl/video {:title "Vídeos"
               :list video}))

(defn get-video [video]
	{:status 200
	 :headers {"Content-Type" "video/mp4"}
	 :body (java.io.File. (.concat "/home/jocelio/Videos/pocoyo/" video))})

;(defn get-video [req]
;	(let [vid (get-in req [:path-params :video]) vid2 "angra_-_nova-era.mp4"]
;	{:status 200
;	 :headers {"Content-Type" "video/mp4"}
;	 :body (java.io.File. (.concat "/home/jocelio/Videos/pocoyo/" vid2))}))


(defn teste [teste]
    (printf teste)
	  (let [vid "video.bla"]
	  {:status 200
     :headers {"Content-Type" "text/html; charset=utf-8"}
	   :body  (.concat "/home/jocelio/Videos/pocoyo/" teste)}))

