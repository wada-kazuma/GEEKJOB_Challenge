<%-- 
    Document   : ArrayList hairetunosakusei
    Created on : 2017/10/11, 13:27:53
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
  String[] data={"10","100","soeda","hayashi","20","118","END"};
  
        out.println(data[0]);
        out.println(data[1]);
        out.println(data[2]);
        out.println(data[3]);
        out.println(data[4]);
        out.println(data[5]);
        out.println(data[6]);
    %>
    </body>
</html>
