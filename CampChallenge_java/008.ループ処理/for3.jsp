<%-- 
    Document   : for3
    Created on : 2017/10/11, 15:39:27
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
            int total=0;
            for(int i=0;i<=100;i++){
            total=total+i;
            out.println(total);
        }
          %>
    </body>
</html>
