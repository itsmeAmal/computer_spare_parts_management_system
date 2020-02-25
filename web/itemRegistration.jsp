<%-- 
    Document   : itemRegistration
    Created on : Oct 4, 2019, 6:45:11 AM
    Author     : kushani
--%>

<%@page import="com.sms.control.subCategoryControl"%>
<%@page import="com.sms.control.categoryControl"%>
<%@page import="com.sms.control.brandControl"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Spare parts Management System</title>
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
                background-color: #4CAF50;
                color: white;
                padding: 14px 20px;
                margin: 8px 0;
                border: none;
                border-radius: 4px;
                cursor: pointer;
            }

            input[type=submit]:hover {
                background-color:#191970;
            }

            div {
                border-radius: 5px;
                background-color: #F5FFFA;
                padding: 10px;
            }
        </style>
    </head>
    <body>


        <form action="addItemServlet" method="post">

            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #F5FFFA;" />

            <h1 align="center">Add Items</h1> 

            <div id="itemname">
                Item Name
                <input type="text" name="itemName" placeholder="Item Name" class="form-control" required />
            </div> 

            <div id="payment_type_d">
                Category
                <%
                    ResultSet rset2 = categoryControl.getAllCategory();
                %>
                <select class="form-control" name="category">
                    <%
                        while (rset2.next()) {%>
                    <option name="categoryName"><%= rset2.getString("category_name")%></option> 
                    <%
                        }
                    %>
                </select>
            </div>          
            <div id="payment_type_d">
                Sub Category
                <%
                    ResultSet rset3 = subCategoryControl.getAllsubCategory();
                %>
                <select class="form-control" name="subcategoryname">
                    <%
                        while (rset3.next()) {
                    %>
                    <option name="subCategoryName"><%= rset3.getString("sub_category_name")%></option> 
                    <%
                        }
                    %>
                </select>
            </div>
            <div id="itemdescription">
                Item Description
                <input type="text" name="description" placeholder="Item Description" class="form-control" required />
            </div>


            <div id="payment_type_d">
                Brand
                <%
                    ResultSet rset = brandControl.getAllBrand();
                %>

                <select class="form-control" name="brand">
                    <%
                        while (rset.next()) {
                    %>
                    <option name="brand"><%= rset.getString("brand_name")%></option>    
                    <%
                        }
                    %>
                </select>
            </div>

            <div id="btn_2">
                <input type="Submit" value="ADD" class="form-control" style="color: #ffffff;  alignment-adjust: middle; "  />
            </div>
        </div>

    </form>


</body>
</html>
