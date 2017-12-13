<%-- 
    Document   : response
    Created on : Dec 13, 2017, 12:21:56 PM
    Author     : klsim
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body bgcolor=#34495E>>
    <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.NameHandler" />
    <jsp:setProperty name="mybean" property="name" />
    <h1><font color="#F4D03F">Hello, <jsp:getProperty name="mybean" property="name" />!</font></h1>

    <p><font color = #ECF0F1 size="5">Nice to meet you</font></p>
    <br>
    <p><font color = #ECF0F1 size="5">In case you were wondering, Peter Pan is one of my 
        favorite stories, so here's a quote from Peter Pan that I Love: </font></p>
    <p><font color = #F4D03F size="5">"To live would be and awfully BIG adventure"</font></p>
    <br>
    <p><font color = #ECF0F1 size="5">Thanks for stopping by, have a great day!.</font></p>
</body>
</html>
