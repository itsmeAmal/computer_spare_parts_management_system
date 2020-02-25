<%-- 
    Document   : subCategory
    Created on : Oct 6, 2019, 1:28:50 AM
    Author     : user
--%>

<%@page import="com.sms.control.categoryControl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sub Category</title>
        <style>

            input[type=text], select {
                width: 100%;
                padding: 12px 20px;
                margin: 8px 0;
                display: inline-block;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
            }

            input[type=submit] {
                width: 100%;
                background-color:#4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color:#483D8B;
            }

            div {
                border-radius: 5px;
                background-color:#F5FFFA;
                padding: 10px;
            }
        </style>

    </head>
    <body>
        <form action="subCategoryServlet">

            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 55%; background-color:#F5FFFA;" />
            <h1 align="center">Add Sub Category</h1> 

            <div id="categoryid">
                Sub Category Name
                <input type="text" name="subCategoryName" placeholder="Sub Category Name" class="form-control" required />
            </div> 

            <div id="payment_type_d">
                Category
                <%
                    ResultSet rset2 = categoryControl.getAllCategory();
                %>
                <select class="form-control" name="categoryName">
                    <%
                        while (rset2.next()) {%>
                    <option><%= rset2.getString("category_name")%></option> 
                    <%
                        }
                    %>

                </select>
            </div>

            <div id="btn_2">
                <input type="Submit" value="ADD" class="form-control" style="color: #ffffff; alignment-adjust: middle; "  />
            </div>
        </div>

    </form>
</body>
</html>
