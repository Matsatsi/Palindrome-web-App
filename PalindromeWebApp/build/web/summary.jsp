<%-- 
    Document   : summary
    Created on : 24 Mar 2024, 12:14:18 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>summary Page</title>
    </head>
    <body>
        <h1>Summary</h1>
        <%
            int numWords=(Integer)session.getAttribute("count");
            int numPalindrome =(Integer)session.getAttribute("numPalindrome");
        %>
        <table>
            <tr>
                <td><b>Number of Words Checked:</b></td>
                <td><%=numWords%></td>
            </tr>
            <tr>
                <td><b>Number of Palindromes:</b></td>
                <td><%=numPalindrome%></td>
            </tr>
        </table>
    </body>
</html>
