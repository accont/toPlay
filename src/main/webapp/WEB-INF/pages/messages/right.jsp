<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/4/15
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/muban/images/favicon.ico" />
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-144-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-114-precomposed.png" />
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-72-precomposed.png" />
<link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-57-precomposed.png" />
<title>Blog Page</title>
<link href="<%=request.getContextPath()%>/assets/muban/css/bootstrap.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/assets/muban/css/style.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/assets/muban/css/prettyPhoto.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/assets/muban/css/font-icomoon.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/assets/muban/css/font-awesome.css" type="text/css" rel="stylesheet" />

<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.easing.1.3.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.quicksand.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/superfish.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/hoverIntent.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.flexslider.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jflickrfeed.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.prettyPhoto.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.elastislide.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.tweet.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/smoothscroll.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.ui.totop.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/main.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/ajax-mail.js"></script>
<html>
<head>
    <title></title>
</head>
<body>
<!--右边内容 -->
<aside id="sidebar" class="pull-right span4">
  <section>
    <h3 class="widget-title">Ready to Purchase</h3>
    <p>Lorem ipsum dolor sit amet, consect <a href="#">etuer adipi scing</a> elit, sed diam nonummy nibh euis mod tinci dunt ut laoreet dolore magna</p>
    <a href="#" class="btn btn-large btn-danger">Purchase</a>
  </section>
  <section>
    <h3 class="widget-title">Categories</h3>
    <ul class="icons ul-list">
      <li><a href="#">Nam Interdum Tellus Nisi</a></li>
      <li><a href="#">Nullam Pharetra Velit Quam</a></li>
      <li><a href="#">Phasellus Blandit Cursus </a></li>
      <li><a href="#">Donec Vulputate Justo </a></li>
      <li><a href="#">Nulla Commodo Leo </a></li>
    </ul>
  </section>
  <section class="popular-posts">
    <h3 class="widget-title">Popular Post Widget</h3>
    <div class="media">
      <a class="pull-left" href="./blog-single.html">
        <img class="media-object" src="example/sidebar2.jpg" alt="" />
        <span class="frame-overlay"></span>
      </a>
      <div class="media-body">
        <h4 class="media-heading"><a href="./blog-single.html">Phasellus Blandit Cursus</a></h4>
        <p>Cras sit amet arcu ante, sed adipiscing nibh quisque vitae turpis sit amet dui condimentum</p>
      </div>
    </div>
    <div class="media">
      <a class="pull-left" href="./blog-single.html">
        <img class="media-object" src="example/sidebar3.jpg" alt="" />
        <span class="frame-overlay"></span>
      </a>
      <div class="media-body">
        <h4 class="media-heading"><a href="./blog-single.html">Phasellus Blandit Cursus</a></h4>
        <p>Cras sit amet arcu ante, sed adipiscing nibh quisque vitae turpis sit amet dui condimentum</p>
      </div>
    </div>
    <div class="media">
      <a class="pull-left" href="./blog-single.html">
        <img class="media-object" src="example/sidebar4.jpg" alt="" />
        <span class="frame-overlay"></span>
      </a>
      <div class="media-body">
        <h4 class="media-heading"><a href="./blog-single.html">Phasellus Blandit Cursus</a></h4>
        <p>Cras sit amet arcu ante, sed adipiscing nibh quisque vitae turpis sit amet dui condimentum</p>
      </div>
    </div>
  </section>
  <section>
    <h3 class="widget-title">Blog Archives</h3>
    <div class="accordion" id="accordion2">
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse1">
            <i class="icon-minus icon-white"></i>
            December 2012
          </a>
        </div>
        <div id="collapse1" class="accordion-body collapse in">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse2">
            <i class="icon-plus icon-white"></i>
            November 2012
          </a>
        </div>
        <div id="collapse2" class="accordion-body collapse">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse3">
            <i class="icon-plus icon-white"></i>
            October 2012
          </a>
        </div>
        <div id="collapse3" class="accordion-body collapse">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse4">
            <i class="icon-plus icon-white"></i>
            September 2012
          </a>
        </div>
        <div id="collapse4" class="accordion-body collapse">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse5">
            <i class="icon-plus icon-white"></i>
            August 2012
          </a>
        </div>
        <div id="collapse5" class="accordion-body collapse">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
      <div class="accordion-group">
        <div class="accordion-heading">
          <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapse6">
            <i class="icon-plus icon-white"></i>
            July 2012
          </a>
        </div>
        <div id="collapse6" class="accordion-body collapse">
          <div class="accordion-inner">
            <ul class="icons ul-list-2">
              <li><a href="#">Wed Design</a></li>
              <li><a href="#">Responsive</a></li>
              <li><a href="#">HTML5 / CSS3</a></li>
              <li><a href="#">Coding Essentials</a></li>
              <li><a href="#">SEO Optimization</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </section>
  <section>
    <h3 class="widget-title">Tag Cloud</h3>
    <div class="tags">
      <a href="#"><i class="icon-tag icon-white"></i>jquery</a>
      <a href="#"><i class="icon-tag icon-white"></i>css3</a>
      <a href="#"><i class="icon-tag icon-white"></i>html5</a>
      <a href="#"><i class="icon-tag icon-white"></i>web design</a>
      <a href="#"><i class="icon-tag icon-white"></i>busines</a>
      <a href="#"><i class="icon-tag icon-white"></i>creative</a>
      <a href="#"><i class="icon-tag icon-white"></i>responsive</a>
      <a href="#"><i class="icon-tag icon-white"></i>development</a>
      <a href="#"><i class="icon-tag icon-white"></i>javascript</a>
      <a href="#"><i class="icon-tag icon-white"></i>usability</a>
      <a href="#"><i class="icon-tag icon-white"></i>typography</a>
      <a href="#"><i class="icon-tag icon-white"></i>optimization</a>
      <a href="#"><i class="icon-tag icon-white"></i>tips</a>
      <a href="#"><i class="icon-tag icon-white"></i>e-commerce</a>
      <a href="#"><i class="icon-tag icon-white"></i>seo</a>
    </div>
  </section>
</aside>

</body>
</html>
