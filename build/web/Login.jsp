<%-- 
    Document   : Login
    Created on : May 11, 2020, 5:00:24 PM
    Author     : DELL 3578
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Login</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="./assets/vendor/bootstrap/css/bootstrap.min.css">
    <link href="./assets/vendor/fonts/circular-std/style.css" rel="stylesheet">
    <link rel="stylesheet" href="./assets/libs/css/style.css">
    <link rel="stylesheet" href="./assets/vendor/fonts/fontawesome/css/fontawesome-all.css">
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <style>
    html,
    body {
        height: 100%;
    }

    body {
        display: -ms-flexbox;
        display: flex;
        -ms-flex-align: center;
        align-items: center;
        padding-top: 40px;
        padding-bottom: 40px;
    }
    </style>
    <body>
        <!-- ============================================================== -->
    <!-- login page  -->
    <!-- ============================================================== -->
    <div class="splash-container">
        <div class="card ">
            <div class="card-header text-center"><a href="./index.html"></a><span class="splash-description">Please enter your user information!</span></div>
            
            <div class="card-body">
                <s:form action="login.baconsoi" method="POST">
                    <form>
                        
                        <div class="form-group">
                            <input class="form-control form-control-lg" name="user" type="text" placeholder="Username" autocomplete="off">
                        </div>
                        <div class="form-group">
                            <input class="form-control form-control-lg" name="pass" type="password" placeholder="Password">
                        </div>
                        <div class="form-group">
                            <label class="custom-control custom-checkbox">
                                <input class="custom-control-input" type="checkbox"><span class="custom-control-label">Remember Me</span>
                            </label>
                        </div>
                        <button type="submit" class="btn btn-primary btn-lg btn-block" method="execute">Sign in</button>
                    </form>
                </s:form>
                
            </div>
            <div class="card-footer bg-white p-0  ">
                <div class="card-footer-item card-footer-item-bordered">
                    <a href="#" class="footer-link">Create An Account</a></div>
                <div class="card-footer-item card-footer-item-bordered">
                    <a href="#" class="footer-link">Forgot Password</a>
                </div>
            </div>
        </div>
    </div>
  
    <!-- ============================================================== -->
    <!-- end login page  -->
    <!-- ============================================================== -->
    <!-- Optional JavaScript -->
    <script src="../assets/vendor/jquery/jquery-3.3.1.min.js"></script>
    <script src="../assets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
        
    </body>
</html>
