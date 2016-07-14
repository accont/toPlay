<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
<script>
     $(document).ready(function() {
       $("#pager").pager({ pagenumber: 1, pagecount: '${requestScope.count}', buttonClickCallback: PageClick });
     });

     PageClick = function(pageclickednumber) {
       $("#pager").pager({ pagenumber: pageclickednumber, pagecount: '${requestScope.count}', buttonClickCallback: PageClick });
     };



</script>
<style>
  html, body {
    font: normal 13px "Microsoft YaHei";
    font-family: "Microsoft YaHei","微软雅黑","sans-serif";
  }
</style>

<html>
<head>
    <title></title>
</head>
<body>

<!--头页面图片 -->
<iframe src="http://localhost:8080/heading" scrolling="no" frameborder="0" height="150px"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>
<!--选项菜单栏 -->
<iframe src="http://localhost:8080/menu" scrolling="no" frameborder="0" height="150px"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>
<!--搜索框 -->
<section class="breadcrumbs">
  <div class="container">
    <div class="row">
      <div class="span12">
        <div class="page-header">
          <div class="row">
            <div class="span8">
              <h1>Blog <small>/ Phasellus erat felis</small></h1>
              <div><a href="/">Home</a> &nbsp;&rsaquo;&nbsp; Blog</div>
            </div>
            <div class="span4 hidden-phone">
              <section class="search clearfix">
                <form id="search" class="input-append" />
                <input class="span4" id="appendedInputButton" size="16" type="text"
                       value="Search..." name="search site" onfocus="if(this.value=='Search...') this.value=''"
                       onblur="if(this.value=='') this.value='Search...'" />
                <input class="btn search-bt" type="submit" name="submit" value="" />
                </form>
              </section>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</section>

<!--内容 -->
<section id="container">
  <div class="container">
    <div class="row">
      <section id="page-sidebar" class="pull-left span8">

        <c:forEach items="${blog}" var="blog" >
        <article class="blog-post">
          <div class="row">
            <div class="span8">
              <h3 class="post-title"><a href="/blg/item?id=${blog.id}">${blog.title}</a></h3>
              <ul class="post-meta">
                <li><i class="icon-calendar"></i> <a href="#"><fmt:formatDate value="${blog.pushDate}" pattern="yyyy-MM-dd : HH:mm"/></a></li>
                <li><i class="icon-user"></i> <a href="#">${blog.name}</a></li>
                <li><i class="icon-tag"></i>  <a href="#">${blog.type}</a> </li>
                <li><i class="icon-comment"></i> <a href="#">12 Comments</a></li>
                <li><i class="glyphicon glyphicon-thumbs-up"><a name="up" title="点赞" href="javascript:void(0)" onclick="up(${blog.id})">${blog.thumb} </a></i></li>
              </ul>
              <div class="post-content" >
                <p>
                    ${blog.message}
                </p>
                <a href="/blg/item?id=${blog.id}" class="btn btn-large btn-welcome">
                  <i class="icon-chevron-right"></i>Continue reading</a>
              </div>
            </div>
          </div>
        </article>
          <hr/>
        </c:forEach>
      </section>
      <!--包含右边的页面的 -->
      <div class="row">
<div style="float: right">
  <jsp:include page="/right"></jsp:include>
</div>

</div>

      </div>
    </div>
  </section>
<!-- 分页 -->
<div class="col-md-3 col-sm-12"></div>
<div class="col-md-5 col-sm-12">
  <c:if test="${page!= null}">
    第<span>${page.pageIndex}</span>页
    <c:if test="${page.pageIndex}!= 1">
      <a href="/blg/list?pageIndex=${page.pageIndex-1}">上一页</a>
    </c:if>
    <c:forEach  var="page" begin="1" end="${count}">
      <a href="/blg/list?pageIndex=${page}">${page}</a>
    </c:forEach>
    <a href="/blg/list?pageIndex=${page.pageIndex+1}">下一页</a>
  </c:if>
</div>

<iframe src="http://localhost:8080/copyright" scrolling="no" frameborder="0" height="80%"
        width="100%" allowtransparency="true"  border="0" style="width:100%;margin-top: 150px;">

</iframe>



</body>
</html>
