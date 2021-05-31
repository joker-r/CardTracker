<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Card Tracker</title>
</head>
<body>
    <div align="center">
        <h2>Track Card</h2>
        <form action="/card-scheme/verify" method="get">
            <label path="cardnumber">Card Number:</label>
            <input type="text" name="cardnumber"/>
            <br/>
            <br/>
         <button>Submit</button>
        </form>
    </div>
</body>
</html>
