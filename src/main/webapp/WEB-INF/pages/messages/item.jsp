<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>item</title>
  <meta name="viewport" content="width=100%; initial-scale=1; maximum-scale=1; minimum-scale=1; user-scalable=no;" />
  <link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/muban/images/favicon.ico" />
  <link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-144-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-114-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-72-precomposed.png" />
  <link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/assets/muban/images/apple-touch-icon-57-precomposed.png" />

  <title>Blog Page</title>
  <link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.0/css/bootstrap.min.css">
  <link href="<%=request.getContextPath()%>/assets/muban/css/style.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/assets/muban/css/prettyPhoto.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/assets/muban/css/font-icomoon.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/assets/muban/css/font-awesome.css" type="text/css" rel="stylesheet" />
  <link href="<%=request.getContextPath()%>/assets/css/Pager.css" type="text/css" rel="stylesheet" />

  <script type="text/javascript" src="<%=request.getContextPath()%>/assets/muban/js/jquery.min.js"></script>
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
  <script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/moment-strftime.min.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath()%>/assets/js/jquery.pager.js"></script>
  <script type="text/javascript" src="<%=request.getContextPath()%>/assets/admin/js/blog.js"></script>
  <script src="http://apps.bdimg.com/libs/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
<!--头页面图片 -->
<iframe src="http://localhost:8080/heading" scrolling="no" frameborder="0" height="150px"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>
<!--选项菜单栏 -->
<iframe src="http://localhost:8080/menu" scrolling="no" frameborder="0" height="150px"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>
<section id="container">
  <div class="container">
    <div class="row">
      <section id="page-sidebar" class="alignrleft span8">
        <!-- 文章内容明细 -->
        <article class="blog-post">
          <div class="row">
            <div class="span8">
              <h3 class="post-title"><a href="./blog-single.html">${extBlog.title}</a></h3>
              <div class="post-media"><img src="example/blog1.jpg" alt="" /></div>
              <div class="post-content">
                ${extBlog.message}
                <%--<p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed quis leo imperdiet tortor vulputate dignissim id in odio. Etiam mi risus, commodo ac feugiat non, fringilla eget justo. Ut id porttitor turpis. Sed adipiscing pretium pellentesque. In hac habitasse platea dictumst. Mauris sit amet mauris tellus. In sollicitudin est ut metus accumsan luctus.
                </p>
                <p>
                  Sed ut lacus at elit bibendum congue in id nulla. Vestibulum eros neque, venenatis non tincidunt sit amet, gravida adipiscing enim. Quisque tellus dolor, elementum eu faucibus ac, malesuada nec justo. Mauris ut pretium quam. Sed tempus pellentesque imperdiet. Cras semper facilisis dui, vitae ultricies leo imperdiet in. Proin gravida congue pretium. Duis cursus odio eu lorem vulputate pretium ultrices massa ultricies. Cras nec tincidunt sapien. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                </p>--%>
                <%--<blockquote>
                  Maecenas non nisl et erat tincidunt lobortis. Sed tempus feugiat sem sed auctor. Praesent id leo nec felis tempor viverra. Praesent metus augue, porttitor at bibendum vel, adipiscing consectetur tortor. Phasellus eu ligula turpis. Nulla porta, tortor pulvinar tincidunt tristique, metus nunc vestibulum magna, vel dictum odio tellus ut nisl. Nullam euismod tristique velit at pulvinar.
                </blockquote>
                <p>
                  Suspendisse tempus mi sit amet arcu eleifend aliquet. Cras odio tellus, sagittis at auctor sed, semper at eros. Ut consequat euismod dui id eleifend. Integer imperdiet velit nec quam dignissim pretium. Quisque tristique, orci eu fringilla bibendum, turpis arcu consequat massa, vitae porta leo libero gravida lectus. Etiam ac urna at massa molestie vehicula. Sed sit amet odio metus, quis placerat dolor. Proin dignissim ornare hendrerit. Fusce scelerisque mauris vel odio interdum non faucibus libero porttitor. Pellentesque neque turpis, tristique ut condimentum sed, porta ac orci. Nullam vitae dolor eget magna commodo dapibus. Curabitur accumsan ante et sem lacinia eget cursus magna commodo. Ut felis erat, vehicula vel placerat eu, mattis ut odio. Nunc porta consectetur lacus at congue.
                </p>--%>
              </div>
              <ul class="post-meta">
                <li><i class="icon-calendar"></i> <a href="#"><fmt:formatDate value="${extBlog.pushDate}" pattern="yyyy-MM-dd : HH:mm"/></a></li>
                <li><i class="icon-user"></i> <a href="#">${extBlog.name}</a></li>
                <li><i class="icon-tag"></i> <a href="#">${extBlog.type}</a></li>
                <li><i class="glyphicon glyphicon-thumbs-up"><a name="up" title="点赞" href="javascript:void(0)" onclick="up(${extBlog.id})">${extBlog.thumb} </a></i></li>
              </ul>
            </div>

          </div>
        </article>
        <hr />
      </section>
    </div>
    </div>
  </section>
<%--
<jsp:include page="/right"></jsp:include>
--%>

</body>
</html>
