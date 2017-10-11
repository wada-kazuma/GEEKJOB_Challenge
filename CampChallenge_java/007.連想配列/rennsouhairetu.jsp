<%-- 
    Document   : rennsouhairetu
    Created on : 2017/10/11, 14:28:28
    Author     : kazuma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page  import="java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        <%
        HashMap<String,String>user1=new HashMap<String,String>();
        HashMap<String,String>user2=new HashMap<String,String>();
                
         user1.put("1","AAA"); user1.put("hello","world");
         user2.put("soeda","33");user2.put("20","20");
         ArrayList<HashMap>data=new ArrayList<HashMap>();
         data.add(user1);
         data.add(user2);
          %>
                 
    </body>
</html>
