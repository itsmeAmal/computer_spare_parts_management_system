<%-- 
    Document   : commonTableTemplate
    Created on : Oct 6, 2019, 8:38:34 PM
    Author     : Amal
--%>

<%@page import="com.sms.control.subCategoryControl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
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
        <div style="position: absolute; left: 20%; top: 180px; width: 973px; height: 490px;background-color: #ccccff;">   
            <h3>Sub Category Details</h3>
            <div style="overflow-x:auto;">
                <table>
                    <%
                        ResultSet rset = subCategoryControl.getAllsubCategory();
                    %>
                    <th>Sub Category Name</th>
                    <th>Category Name</th>
                        <%
                            while (rset.next()) {%>
                    <tr>
                        <td><%= rset.getString("sub_category_name")%></td>
                        <td><%= rset.getString("sub_category_category_name")%></td>
                        <td></td>
                        <td><button class="button_" style="vertical-align:middle"><span>DELETE </span></button></td>
                    </tr>   
                    <%
                        }
                    %>
                </table>
            </div>
        </div>
    </body>
</html>
