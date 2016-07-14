
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<link href="<%=request.getContextPath()%>/assets/bootstrap/css/bootstrap.min.css" type="text/css" rel="stylesheet" />
<link href="<%=request.getContextPath()%>/asstes/plugins/css/framework.css" type="text/css" rel="stylesheet" >
<link href="<%=request.getContextPath()%>/asstes/plugins/css/style.css" type="text/css" rel="stylesheet" >
<link href="https://cdnjs.cloudflare.com/ajax/libs/select2/4.0.2/css/select2.min.css" rel="stylesheet" />
<script type="text/javascript" src="<%=request.getContextPath()%>/asstes/plugins/js/jquery-1.9.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/asstes/plugins/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/asstes/plugins/js/app.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/asstes/plugins/js/libs.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/assets/ckeditor/ckeditor.js"></script>
<script>

</script>
<head>
    <title>发布</title>
</head>
<body style="background-color: transparent">

<!--头页面 -->
<iframe src="http://localhost:8080/heading" scrolling="no" frameborder="0" height="31%"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>

<iframe src="http://localhost:8080/menu" scrolling="no" frameborder="0" height="150px"
        width="100%" allowtransparency="true"  border="0" style="width:100%"></iframe>

<div class="center-block" style="width: 960px">
<form role="form" action="/blg/blogAdd" method="post" class="form-horizontal">
  <div class="form-group" style="margin: 15px;">
    ${messages}
    <label for="title" class="col-lg-2">文章标题：</label>
    <input type="text" class="col-lg-4" style="height: 35px;" id="title" name="title">
  </div>

  <div class="form-group" style="margin: 15px;">
    <label for="type" class="col-lg-2">语言类型：</label>
    <select data-tags="true" style="height: 35px;" class="col-lg-4" name="type" id="type" data-placeholder="Select an option" data-allow-clear="true">
      <option value="java" selected>java</option>
      <option value="shell">shell</option>
      <option value="python">python</option>
      <option value="other">other</option>
    </select>
  </div>

  <div class="form-group" style="margin: 15px;">
    <label for="message" style="margin: 15px;">编辑内容：</label>
    <textarea id="message" name="message" ></textarea>
    <script type="text/javascript">CKEDITOR.replace('message');</script>
  </div>

  <div class="row">
    <span class="col-lg-3"></span>
    <input type="submit" class="btn btn-primary col-lg-1" id="sub" value="发布">
    <span class="col-lg-2"></span>
    <input type="reset" class="btn btn-danger col-lg-1" value="取消">
  </div>
</form>

</div>
<iframe src="http://localhost:8080/copyright" scrolling="no" frameborder="0" height="10%"
        width="100%" allowtransparency="true"  border="0" style="width:100%;margin-top: 150px;">

        </iframe>
</body>
</html>
