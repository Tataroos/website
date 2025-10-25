<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h3>Welcome, <%= request.getParameter("uname") %>!</h3>
    <h4>Multiplication Table for <%= request.getParameter("number") %>:</h4>
    <pre>
    <%
        try {
            int num = Integer.parseInt(request.getParameter("number"));
            for (int i = 1; i <= 10; i++) {
                out.println(num + " x " + i + " = " + (num * i));
            }
        } catch (NumberFormatException e) {
            out.println("Invalid number input.");
        }
    %>
    </pre>
</body>
</html>