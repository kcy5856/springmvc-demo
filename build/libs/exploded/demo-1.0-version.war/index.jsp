<%--
  Created by IntelliJ IDEA.
  User: 康晨阳
  Date: 2018/2/24
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script>
  function doPost() {
      window.location("/first/");
  }
</script>
<html>
  <head>
    <title>demo page</title>
  </head>
  <body>
    第一次测试<br/>
    <form name="firstform" action="/first/queryage" method="get">
      姓名：<input type="text" name="age" value=""/>
      <input type="submit" value="测 试">
    </form>


  </body>
</html>
