<%-- 
    Document   : category
    Created on : Oct 4, 2019, 2:52:36 PM
    Author     : kushani
--%>

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
        <form action="addCategServlet">
            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color:#F5FFFA;" />
            <h1>Add Category</h1> 
            <div id="categoryname">
                Category Name
                <input type="text" name="categoryname" placeholder="Category Name" class="form-control" required />
            </div> 
            <div id="categorycode">
                Category Code
                <input type="text" name="categorycode" placeholder="Category Code" class="form-control" required />
            </div>
            <div id="btn_2">
                <input type="Submit" value="ADD" class="form-control" style="color: #ffffff; alignment-adjust: middle; "  />
            </div>
        </div>
    </form>
</body>
</html>
