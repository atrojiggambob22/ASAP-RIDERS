<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Shopping-Cart Login</title>
    <%--<%@include file="includes/head.jsp"%>--%>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    
    <link rel="stylesheet" 
					href="css/login.css" />
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;1,100;1,200&family=Roboto+Slab&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Shadows+Into+Light&display=swap')
      </style>
</head>
<body>
<div class="container">
    <div class="card">
        <div class="card-header">User Login</div>
        <div class="card-body">
            <form action="login" method="post">
                 <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="username" placeholder="username">
                    </div>

                <div class="form-group">
                    <!--<label>Password</label>-->
                    <i class="fas fa-lock" id="ff"></i>
                    <input type="password" class="form-control" name="login-password" placeholder="Pas******" required>
                </div>

                <div class="login-botton">
                    <button type="submit" class="btn">Login</button>
                </div>
            </form>
        </div>
    </div>
</div>
    <%--<%@include file="nav.jsp"%>--%>
<%--<%@include file="includes/footer.jsp"%>--%>
</body>
</html>
