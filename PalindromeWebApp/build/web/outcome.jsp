<%-- 
    Document   : outcome
    Created on : 24 Mar 2024, 12:01:30 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>outcome Page</title>
    </head>
    <body>
        <h1>Outcome</h1>
        <%
           String word=(String)session.getAttribute("word");
           String reverse=(String)session.getAttribute("reverseWord");
           String outcome=(String)session.getAttribute("outcome");
        %>
        <table>
            <tr>
                <td><b>Word:</b></td>
                <td><%=word%></td>
            </tr>
            <tr>
                <td><b>Reversed Word:</b></td>
                <td><%=reverse%></td>
            </tr>
            <tr>
                <td><b>Outcome:</b></td>
                <td><%=outcome%></td>
            </tr>
        </table>
        <p>Click <a href="word_entry.html">here</a> to check a word or <a href="summary.jsp">here</a> to get summary</p>
    </body>
</html>
