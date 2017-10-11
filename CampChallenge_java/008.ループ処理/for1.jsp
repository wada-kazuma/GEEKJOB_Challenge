<%-- 
    Document   : for1
    Created on : 2017/10/11, 15:11:10
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
 <% long total=1;
       for(int i=0;i<20;i++){
       total=total*8;
       out.println(total);
       }
       
  %>
    </body>
</html>
