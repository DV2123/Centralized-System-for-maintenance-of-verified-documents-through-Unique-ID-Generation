<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <!-- 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sign Up</title>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            font-family: sans-serif;
            background-color: #f0f0f0; /* Light gray background */
        }
        .signup-btn {
            color: black;

        }
        .signup-btn:hover {
            color: rebeccapurple;
        }
    </style>
</head>
<body>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <div class="card mt-5">
                    <div class="card-body">
                        <h1 class="card-title text-center">Sign Up</h1>
                        <form action="/FullStack/login/save" method="post"> 
                            <div class="form-group">
                                <label for="user-id">User ID:</label>
                                <input type="text" class="form-control" id="user-id" placeholder="Enter your User ID" name="username" required>
                            </div>
                            <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" class="form-control" id="password" placeholder="Enter your Password" name="password" required>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <button type="submit" name="btnSave" class="btn btn-success btn-block">Sign Up</button>
                                </div>
                                <div class="col">
                                    <a href="/FullStack/login/create" class="signup-btn btn btn-link ">SignUp</a>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
 -->  
 
 <!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>SignUp Form</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    /* Custom CSS for form */
    .signup-form {
      max-width: 400px;
      margin: 0 auto;
    }
  </style>
</head>
<body>
  
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-md-6">
        <div class="card mt-5">
          <div class="card-header">
            <h3>SignUp Form</h3>
          </div>
          <div class="card-body">
            <form class="signup-form" action="/FullStack/home/save" method="post">
              <div class="form-group">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" placeholder="Enter username" name="username">
              </div>
              <div class="form-group">
                <label for="address">Address</label>
                <input type="text" class="form-control" id="address" placeholder="Enter address" name="Address">
              </div>
              <div class="form-group">
                <label for="addressPin">Address Pin</label>
                <input type="text" class="form-control" id="addressPin" placeholder="Enter address pin" name="AddressPin">
              </div>
              <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
              </div>
              <div class="form-group">
                <label for="email">Email</label>
                <input type="email" class="form-control" id="email" placeholder="Enter email" name="Email">
              </div>
              <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
  <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
 
