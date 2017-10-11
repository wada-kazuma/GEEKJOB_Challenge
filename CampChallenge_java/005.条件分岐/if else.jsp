<%-- 
    Document   : if else
    Created on : 2017/10/11, 11:40:28
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
            int num =1;
            
            if(num==1){
                out.print("１です！");
            }
            else if(num==2){
                out.print("プログラミングキャンプ！");
            }
           else{
                out.print("その他です!");
        }
        %>
    </body>
</html>
