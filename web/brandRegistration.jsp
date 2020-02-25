<%-- 
    Document   : brandList
    Created on : Oct 6, 2019, 1:30:51 AM
    Author     : kushani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
        <form action="addBrandServlet">
            <div style="position: absolute; left: 20%; width: 60%; top: 5%; height: 85%; background-color: #F5FFFA;" />

            <h1 align="center">Add Brands</h1> 
            <div id="brandname">
                <input type="text" name="brandName" placeholder="Brand Name" class="form-control" required />
            </div> 
            <div id="branddescription">
                <input type="text" name="description" placeholder="Brand Description" class="form-control" required />
            </div>
            <div id="brandStatus">
                <input type="text" name="origin" placeholder="Country Of Origin" class="form-control" required />
            </div>       
            <div id="btn_2">
                <input type="Submit" value="ADD" class="form-control" style="color: #ffffff;  alignment-adjust: middle; "  />
            </div>
        </div>

    </form>
</body>
</html>
