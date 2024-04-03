<!-- 
<html>
<body>
<a href = "/FullStack/login/create">Create Account</a>
<h2>Hello World!</h2>
</body>
</html>

 -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
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
                        <h1 class="card-title text-center">Login</h1>
                        <form action="/FullStack/home/info" method="post"> 
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
                                    <button type="submit" name="btnSave" class="btn btn-success btn-block">Login</button>
                                </div>
                                <div class="col">
                                    <a href="/FullStack/home/create" class="signup-btn btn btn-link ">SignUp</a>
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
