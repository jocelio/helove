

{{#list}}

  <a href="videos/{{ . }}"> {{ . }} </a>
  <br/>

  <video width="320" height="240" controls>
  <source src="{{ . }}" type="video/mp4">
  Your browser does not support the video tag.
  </video>

{{/list}}
