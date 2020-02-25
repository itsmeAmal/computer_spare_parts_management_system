<%-- 
    Document   : dashBoard
    Created on : Oct 5, 2019, 3:40:04 AM
    Author     : Amal
--%>

<%@page import="com.sms.control.userControl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>autospa.lk</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <style>
            .button {
                background-color: #660066;
                border: none;
                color: white;
                padding: 10px 10px;
                text-align: center;
                font-size: 16px;
                margin: 4px 2px;
                opacity: 0.6;
                transition: 0.3s;
                display: inline-block;
                text-decoration: none;
                cursor: pointer;
                width: 320px;
            }

            .button:hover {opacity: 1}
            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {background-color: #f2f2f2;}
            /*//-----------------*/
            .button_ {
                display: inline-block;
                border-radius: 4px;
                background-color: #3399ff;
                border: none;
                color: #FFFFFF;
                text-align: center;
                font-size: 14px;
                padding: 10px;
                width: 200px;
                transition: all 0.5s;
                cursor: pointer;
                margin: 5px;
            }

            .button_ span {
                cursor: pointer;
                display: inline-block;
                position: relative;
                transition: 0.5s;
            }

            .button_ span:after {
                content: '\00bb';
                position: absolute;
                opacity: 0;
                top: 0;
                right: -20px;
                transition: 0.5s;
            }

            .button_:hover span {
                padding-right: 25px;
            }

            .button_:hover span:after {
                opacity: 1;
                right: 0;
            }
        </style>
    </head>
    <body>
        <div class="jumbotron text-center" style="margin-bottom:0; height: 160px; padding-top: 3%; background-color: #009999;  transition: 0.3s;">
            <h1>AUTOSPA.lk</h1>
            <p>Resize this responsive page to see the effect!</p> 
        </div>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        </nav>
        <div style="left: 0%; top: 0%; width: 10%; height: 500px;">
            <form action="categoryRegistration.jsp">
                <button class="button">CATEGORY REGISTRATION</button>
            </form>
            <form action="subCategoryRegistration.jsp">
                <button class="button">SUB CATEGORY REGISTRATION</button>
            </form>
            <form action="brandRegistration.jsp">
                <button class="button">BRAND REGISTRATION</button>
            </form>
            <form action="itemRegistration.jsp">
                <button class="button">ITEM REGISTRATION</button>
            </form>
            <form action="userRegistration.jsp">
                <button class="button">USER REGISTRATION</button>
            </form>
            <button class="button">MANAGE CATEGORY</button>
            <button class="button">MANAGE ITEM</button>
            <button class="button">MANAGE USER</button>
        </div>
        <div style="position: absolute; left: 17%; top: 180px; width: 600px; height: 490px;background-color: #ccccff;">            
        </div>
        <div style="position: absolute; left: 49%; top: 180px; width: 973px; height: 490px;background-color: #ccccff;">   
            <div style="overflow-x:auto;">
                <table>
                    <%
                        ResultSet rset = userControl.getAllUsers();
                    %>
                    <th>User Name</th>
                    <th>Email</th>
                    <th>Contact</th>
                    <th>Address</th>
                        <%
                            while (rset.next()) {%>
                    <tr>
                        <td><%= rset.getString("user_name")%></td>
                        <td><%= rset.getString("user_email")%></td>
                        <td><%= rset.getString("user_contact")%></td>
                        <td><%= rset.getString("user_address")%></td>
                    <form action="dashBoardServlet">                       
                        <td><button class="button_" style="vertical-align:middle"><span>DELETE </span></button></td>
                        <td><input type="hidden" name="delete" value="<%= rset.getString("user_id")%>"/></td>
                    </form>
                    </tr>  
                    <%
                        }
                    %>
                </table>
            </div>
        </div>
        <div class="jumbotron text-center" style="margin-bottom:0; background-color: #009999;">
            <p>Footer</p>
        </div>
    </body>
</html>

