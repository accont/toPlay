<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/font-awesome/css/font-awesome.min.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/form-elements.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/assets/css/style.css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
<script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
<script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->

<!-- Favicon and touch icons -->
<link rel="shortcut icon" href="<%=request.getContextPath()%>/assets/ico/favicon.png">
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="<%=request.getContextPath()%>/assets/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="<%=request.getContextPath()%>/assets/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="<%=request.getContextPath()%>/assets/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="<%=request.getContextPath()%>/assets/ico/apple-touch-icon-57-precomposed.png">
<head>
    <title>Login in</title>
</head>
<script>

</script>
<body>
<div class="top-content">
  <div class="inner-bg">
    <div class="container">
      <div class="row">
        <div class="col-sm-8 col-sm-offset-2 text">
          <h1><strong>Blog</strong> Login Form</h1>
          <div class="description">
            <p>
              This is a free responsive login form made with Bootstrap.
              Download it on  <strong>AZMIND</strong> , customize and use it as you like!
            </p>
          </div>
        </div>
      </div>
      <div class="row">
        <div class="col-sm-6 col-sm-offset-3 form-box">
          <div class="form-top">
            <div class="form-top-left">
              <h3>Login to our site</h3>
              <p>Enter your username and password to log on:</p>
            </div>
            <div class="form-top-right">
              <i class="fa fa-lock"></i>
            </div>
          </div>
          <div class="form-bottom">
            <form  role="form" id="userForm" name="userForm" action="/user/login"   method="post" class="login-form">
              <div class="form-group">
                <label class="sr-only" for="form-username">Username</label>
                <input type="text"  name="userName" placeholder="输入你的账号，用于登录，邮箱或者手机号码" class="form-username form-control" id="form-username" required>
              </div>
              <span id="s2">${err}</span>
              <div class="form-group">
                <label class="sr-only" for="form-password">Password</label>
                <input type="password" name="password" placeholder="输入你的密码" class="form-password form-control" id="form-password" required>
              </div>

              <span id="kon"></span>
              <button type="submit" class="btn" id="sub">Sign in!</button>
              <p style="float:right">点着里返回<a href="/">首页</a></p>
              <p align="left"> 还没有账号吗，点这<a href="/account">注册</a></p>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>


<!-- Javascript -->
<script src="<%=request.getContextPath()%>/asstes/plugins/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/assets/js/jquery.backstretch.min.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/assets/js/scripts.js" type="text/javascript"></script>
<script src="<%=request.getContextPath()%>/assets/js/jquery.form.js" type="text/javascript"></script>
<!--[if lt IE 10]>
<script src="/assets/js/placeholder.js" type="text/javascript"></script>
<![endif]-->

</body>
</html>
