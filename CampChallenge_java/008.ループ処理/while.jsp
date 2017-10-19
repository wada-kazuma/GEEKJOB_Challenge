<%-- 
    Document   : while
    Created on : 2017/10/19, 10:39:11
    Author     : kazuma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
       int num = 1000;      
      while(num >= 100){
            num = num / 2;
        out.print(num + "<br>");
       }
        %>
    </body>
</html>
