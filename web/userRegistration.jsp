<%-- 
    Document   : userManagement
    Created on : Oct 2, 2019, 3:50:25 PM
    Author     : Amal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register User</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!--nav bar-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!--tf-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <p></p>
            <nav class="navbar navbar-expand-sm bg-primary navbar-dark">
                <ul class="navbar-nav">
                    <li class="nav-item active" style="font-size: 24px;">
                        <a class="nav-link" href="#">User Registration</a>
                    </li>
                    <!--                    <li class="nav-item">
                                            <a class="nav-link" href="#">Item List</a>
                                        </li>-->
                </ul>
            </nav>
            <!--<h2>User Registration</h2>-->
            <!--<p>The form below contains two input elements; one of type text and one of type password:</p>-->
            <form action="addUserServlet">
                <div class="form-group">
                    <label for="usr">Name:</label>
                    <input type="text" class="form-control" id="usr" name="username" required>
                </div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control" id="email" name="email" required>
                </div>
                <div class="form-group">
                    <label for="pwd">Password:</label>
                    <input type="password" class="form-control" id="pwd" name="password" required>
                </div>
                <div class="form-group">
                    <label for="address">Local Address:</label>
                    <input type="text" class="form-control" id="localAddress" name="localAddress" required>
                </div>
                <div class="form-group">
                    <label for="contact">Contact:</label>
                    <input type="text" class="form-control" id="localAddress" name="contact" required>
                </div>
                <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>
    </body>
</html>
