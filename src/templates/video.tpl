<!DOCTYPE html>
<html>
  <!-- http://mustache.github.com/mustache.5.html -->
  <head>
    <!-- partial is just like copy and paste the template here -->
    {{>partials/header}}
  </head>
  <body>
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">{{sanitized-ns}}</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              <li ><a href="/">Home</a></li>
              <li class="active"><a href="/videos">Videos</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
        <div class="row">
            <div class="col-md-5">

            {{#list}}

      		  <p class="lead"> {{ . }} </p>

      		  <video controls>
      		  <source src="/videos/{{ . }}" type="video/mp4">
      		  Your browser does not support the video tag.
      		  </video>

      	     {{/list}}

        </div>
      </div>

    </div>
    <script src="/static/js/lib/jquery-1.9.1.js"></script>
    <script src="/static/js/lib/bootstrap.js"></script>
  </body>
</html>

