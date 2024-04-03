<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
    
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Unique Id</title>
        <link rel="icon" type="image/x-icon" href="../resources/assets/img/favicon.ico" />
        <!-- Font Awesome icons (free version)-->
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Saira+Extra+Condensed:500,700" rel="stylesheet" type="text/css" />
        <link href="https://fonts.googleapis.com/css?family=Muli:400,400i,800,800i" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link href="../resources/css/styles.css" rel="stylesheet" />
    </head>
    <body id="page-top">
        <!-- Navigation-->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary fixed-top" id="sideNav">
            <a class="navbar-brand js-scroll-trigger" href="#page-top">
                <span class="d-block d-lg-none">Clarence Taylor</span>
                <span class="d-none d-lg-block"><img class="img-fluid img-profile rounded-circle mx-auto mb-2" src="../resources/assets/img/profile.jpg" alt="..." /></span>
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav">
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#about">About</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#experience">Aadhar</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#education">Education</a></li>
                    <li class="nav-item"><a class="nav-link js-scroll-trigger" href="#skills">Pan Card</a></li>
                </ul>
            </div>
        </nav>
        <!-- Page Content-->
        <div class="container-fluid p-0">
            <!-- About-->
            <section class="resume-section" id="about">
                <div class="resume-section-content">
                    <h1 class="mb-0">
                        <!-- Man Patel -->
                        <span class="text-primary">${username }</span>
                    </h1>
                    <div class="subheading mb-5">
                        ${address } Pin :- ${addressPin }
                        <a href="mailto:name@email.com">${email }</a>
                    </div>
                    <p class="lead mb-5">This is all Information about userx .</p>
                    <div class="social-icons">
                        <a class="social-icon" href="#!"><i class="fab fa-linkedin-in"></i></a>
                        <a class="social-icon" href="#!"><i class="fab fa-github"></i></a>
                        <a class="social-icon" href="#!"><i class="fab fa-twitter"></i></a>
                        <a class="social-icon" href="#!"><i class="fab fa-facebook-f"></i></a>
                    </div>
                </div>
            </section>
            <hr class="m-0" />
            <!-- Aadhar -->
            <section class="resume-section" id="experience">
                <form action="/FullStack/home/aadharAdd" method="post">
                    <div class="resume-section-content">
                        <h2 class="mb-5">Aadhar Details</h2>
                        <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                            <div class="flex-grow-1"> 
                                    <input type="text" class="form-control mb-2" value="${aadharName }" placeholder="Enter Aadhar Name" name="aadharName" ${readonly } required>
                                    <input type="text" class="form-control mb-2" value="${aadharNo }" placeholder="Enter Aadhar No" name="aadharNo" ${readonly } required>
                                    <div class="file-upload" ${hiddenChooseAdhar }>
                                        <input type="file" id="fileInput" class="file-input" name="aadharImage">
                                        <label for="fileInput" class="file-upload-label">Choose File</label>
                                    </div>
                                    <img src="../resources/assets/img/aadhaar-card-front.webp" alt="" class="aadhar-img" ${hiddenImageAadhar}>
                            </div>
                        </div>
                        <div>
                            <button type="submit" class="Aadhar-Btn">Save</button>
                           <!--  <button class="Aadhar-Btn"></button> -->
                            <a href = "/FullStack/home/Edit">Edit</a>
                            
                        </div>
                    </div>
                </form>
            </section>
            
            <hr class="m-0" />
            <!-- Education-->
            <section class="resume-section" id="education">
                <form action="/FullStack/home/eduSave" method="post">
                    <div class="resume-section-content">
                        <h2 class="mb-5">Education</h2>
                        <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                            <div class="flex-grow-1">

                                <h2>10th</h2>

                                <h3 class="mb-0" ${eduViewHidden }>${tenSchoolName }</h3>
                                <input type="text" value="${tenSchoolName }" placeholder="Enter School Name" class="form-control mb-2" name="tenSchoolName"  ${hiddenEducation }> 

                                <div class="subheading mb-3" ${eduViewHidden }>Passing Year :- ${tenPassYear }</div>
                                <input type="text" value="${tenPassYear }" placeholder="Enter pass year" class="form-control mb-4" name="tenPassYear" value="${tenPassYear }" ${hiddenEducation }>

                                <h3 ${eduViewHidden }>${tenPercentage }%</h3>
                                <input type="text" value="${tenPercentage }" placeholder="Enter percentage" class="form-control mb-2" name="tenPercentage" value="${tenPercentage }" ${hiddenEducation }>
                                
                            </div>
                            <!-- <div class="flex-shrink-0"><span class="text-primary">August 2006 - May 2010</span></div> -->
                        </div>
                        <div class="d-flex flex-column flex-md-row justify-content-between">
                            <div class="flex-grow-1">

                                <h2>12th</h2>

                                <h3 class="mb-0" ${eduViewHidden }>${twelSchoolName }</h3>
                                <input type="text" value="${twelSchoolName }" placeholder="Enter School Name" class="form-control mb-2" value="${twelSchoolName }" name="twelSchoolName"  ${hiddenEducation }>

                                <div class="subheading mb-3" ${eduViewHidden }>Passing Year :- ${twelPassYear }</div>
                                <input type="text" value="${twelPassYear }" placeholder="Enter pass year" class="form-control mb-2" name="twelPassYear" value="${twelPassYear }" ${hiddenEducation }>

                                <h3 ${eduViewHidden }>${twelPercentage }%</h3>
                                <input type="text" value="${twelPercentage }" placeholder="Enter percentage" class="form-control mb-2" name="twelPercentage" value="${twelPercentage }" ${hiddenEducation }> 

                            </div>
                            <!-- <div class="flex-shrink-0"><span class="text-primary">August 2002 - May 2006</span></div> -->
                        </div>
                        <button type="submit">Save</button>
                        <a href = "/FullStack/home/Edit">Edit</a>
                    </div>
                </form>
            </section>
            <hr class="m-0" />
            <!-- Skills-->

            <section class="resume-section" id="experience">
                <form action="/FullStack/home/panAdd" method="post">
                    <div class="resume-section-content">
                        <h2 class="mb-5">Pan Details</h2>
                        <div class="d-flex flex-column flex-md-row justify-content-between mb-5">
                            <div class="flex-grow-1"> 
                                    <input type="text" class="form-control mb-2" value="${panName }" placeholder="Enter Pan Name" name="panName" ${readonlypan } required>
                                    <input type="text" class="form-control mb-2" value="${panNo }" placeholder="Enter Pan No" name="panNo" ${readonlypan } required>
                                     <div class="file-upload" ${hiddenChoosePan }>
                                        <input type="file" id="fileInput" class="file-input" name="panImage">
                                        <label for="fileInput" class="file-upload-label">Choose File</label>
                                    </div>
                                    <img src="../resources/assets/img/panCard.png" alt="" class="aadhar-img" ${hiddenImagePan}>
                            </div>
                        </div>
                        <div>
                            <button type= "submit" class="Aadhar-Btn">Save</button>
                            <a href = "/FullStack/home/Edit">Edit</a>
                        </div>
                    </div>
                </form>
            </section>
            
            <hr class="m-0" />
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="../resources/js/scripts.js"></script>
    </body>
</html>
