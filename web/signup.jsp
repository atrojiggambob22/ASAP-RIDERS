<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <title>Shopping-Cart Login</title>
    <%--<%@include file="includes/head.jsp"%>--%>
    <link rel="stylesheet" href="css/login.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;1,100;1,200&family=Roboto+Slab&display=swap');
        @import url('https://fonts.googleapis.com/css2?family=Shadows+Into+Light&display=swap')
      </style>
</head>
<body>
    <div class="container">
        <div class="card">
            <div class="card-header">Sign Up</div>
            <div class="card-body">
                <form action="signup" method="post">
                    <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="firstName" placeholder="FirstName">
                    </div>
                    
                    <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="lastName" placeholder="LastName">
                    </div>
                    
                     <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="username" placeholder="Username">
                    </div>
                    
                    <div class="form-group">
                    <i class="fas fa-phone"></i>
                    <input type="tel" class="form-control" placeholder="Phone Number" name="phoneNumber">
                </div>
                    
                    <div class="form-group">
                        <i class="fas fa-envelope"></i>
                        <input type="email" class="form-control" name="email" placeholder="Enter Your Email" required>
                    </div>
                    
                    <div class="form-group">
                        <i class="fas fa-lock"></i>
                        <input type="password" class="form-control" name="password" placeholder="Password" required>
                    </div>
                    
                    <div class="form-group">
                        <i class="fas fa-lock"></i>
                        <input type="password" class="form-control" placeholder="Confirm Password" required>
                    </div>
                    
                    <div id="otherLink">
                        <a href="login.jsp" id="UU">Already have an account? Login instead</a>
                    </div>
                    
                    <div class="login-botton">
                        <button type="submit" class="btn">Signup</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <%--<%@include file="nav.jsp"%>--%>
    <%--<%@include file="includes/footer.jsp"%>--%>
</body>
</html>