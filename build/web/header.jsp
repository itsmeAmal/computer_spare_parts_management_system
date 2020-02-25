<%-- 
    Document   : header
    Created on : Oct 7, 2019, 1:18:11 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Header Page</title>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>

        <!-- Navbar -->
        <div class="w3-top">
            <div class="w3-bar w3-black w3-card">
                <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="myFunction()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
                <a href="home.jsp" class="w3-bar-item w3-button w3-padding-large">HOME</a>
                <a href=ItemList.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">ITEM</a>
                <a href="categoryList.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CATEGORY</a>
                <a href="subCategory.jsp" class="w3-bar-item w3-button w3-padding-large w3-hide-small">SUB CATEGORY</a>
                <div class="w3-dropdown-hover w3-hide-small">
                    <div class="w3-dropdown-content w3-bar-block w3-card-4">
                        <a href="#" class="w3-bar-item w3-button">Merchandise</a>
                        <a href="#" class="w3-bar-item w3-button">Extras</a>
                        <a href="#" class="w3-bar-item w3-button">Media</a>
                    </div>
                </div>
                <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
            </div>
        </div>
    </body>
</html>
