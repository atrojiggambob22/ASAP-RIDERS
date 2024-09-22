<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
<head>
    <title>Shopping-Cart Login</title>
    <%--<%@include file="includes/head.jsp"%>--%>
    <link rel="stylesheet" href="css/admin.css" />
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
                <form action="adminsignup" method="post">
                    <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="signup firstname" placeholder="FirstName">
                    </div>
                    <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="signup lastname" placeholder="LastName">
                    </div>
                    
                    <div class="form-group">
                        <i class="fas fa-user"></i>
                        <input type="text" class="form-control" name="username" placeholder="Username">
                    </div>
                    
                          <div class="form-group">
                    <i class="fas fa-phone"></i>
                    <input type="tel" class="form-control" placeholder="Phone Number">
                        </div>
                    <div class="form-group">
                        <i class="fas fa-envelope"></i>
                        <input type="email" class="form-control" name="email" placeholder="Enter Your Email" required>
                    </div>
                    
                     <div class="form-group">
                    <i class="fas fa-home"></i>
                    <input type="text" class="form-control" placeholder="Home Address">
                </div>
                     
                    <div class="form-group">
                        <i class="fas fa-lock"></i>
                        <input type="password" class="form-control" name="Password" placeholder="Password" required>
                    </div>
                    <div class="form-group">
                        <i class="fas fa-lock"></i>
                        <input type="password" class="form-control" name="Confirm-password" placeholder="Confirm Password" required>
                    </div>
                  
<!--                <div class="form-group">
                    <i class="fas fa-phone"></i>
                    <input type="tel" class="form-control" placeholder="Second Number">
                </div>-->
                <div class="form-group">
                    <i class="fas fa-image"></i>
                    <input type="file" class="form-control">
                </div>
               


                    <div id="otherLink">
                        <a href="login.jsp" id="UU">Already have an account? Login instead</a>
                    </div>
                    <div class="login-botton">
                        <button type="submit" class="btn">Create Account</button>
                    </div>
                    
                </form>
            </div>
        </div>
    </div>
    <%--<%@include file="adminnav.jsp"%>--%>
    <%--<%@include file="includes/footer.jsp"%>--%>
</body>
</html>