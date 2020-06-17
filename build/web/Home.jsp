<%-- 
    Document   : Home
    Created on : May 11, 2020, 4:58:01 PM
    Author     : DELL 3578
--%>

<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to my web site</h1>
        <s:iterator var="i" value="item">
            <s:property value="#i.user"/>
        </s:iterator>
    </body>
</html>
