<%-- 
    Document   : sisokuennzann
    Created on : 2017/10/11, 10:58:09
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
        <%     int num=400;
               int num2=200;
               
               int tasu = num+num2;
               int hiku= num-num2;
               int kake = num*num2;
               int waru = num/num2;
               int amari =num%num2;
      
               out.print(tasu+" <br>");
               out.print(hiku+" <br>");
               out.print(kake+" <br>");
               out.print(waru+" <br>");
               out.print(amari+" <br>");
        %>
    </body>
</html>
