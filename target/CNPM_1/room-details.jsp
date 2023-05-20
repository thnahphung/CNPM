<%@ page import="bean.Room" %>
<!DOCTYPE html>
<html lang="zxx">

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Sona Template">
    <meta name="keywords" content="Sona, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sona | Template</title>


    <link href="https://fonts.googleapis.com/css?family=Lora:400,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Cabin:400,500,600,700&display=swap" rel="stylesheet">


    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/flaticon.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/magnific-popup.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>

<div id="preloder">
    <div class="loader"></div>
</div>


<div class="offcanvas-menu-overlay"></div>
<div class="canvas-open">
    <i class="icon_menu"></i>
</div>
<div class="offcanvas-menu-wrapper">
    <div class="canvas-close">
        <i class="icon_close"></i>
    </div>
    <div class="search-icon search-switch">
        <i class="icon_search"></i>
    </div>
    <div class="header-configure-area">
        <div class="language-option">
            <img src="img/flag.jpg" alt="">
            <span>EN <i class="fa fa-angle-down"></i></span>
            <div class="flag-dropdown">
                <ul>
                    <li><a href="#">Zi</a></li>
                    <li><a href="#">Fr</a></li>
                </ul>
            </div>
        </div>
        <a href="#" class="bk-btn">Booking Now</a>
    </div>
    <nav class="mainmenu mobile-menu">
        <ul>
            <li class="active"><a href="./index.jsp">Home</a></li>
            <li><a href="/vendor">Vendor</a></li>
            <li><a href="about-us.jsp">About Us</a></li>
            <li><a href="./pages.html">Pages</a>
                <ul class="dropdown">
                    <li><a href="./room-details.html">Room Details</a></li>
                    <li><a href="./blog-details.html">Blog Details</a></li>
                    <li><a href="#">Family Room</a></li>
                    <li><a href="#">Premium Room</a></li>
                </ul>
            </li>
            <li><a href="./blog.html">News</a></li>
            <li><a href="./contact.html">Contact</a></li>
        </ul>
    </nav>
    <div id="mobile-menu-wrap"></div>
    <div class="top-social">
        <a href="#"><i class="fa fa-facebook"></i></a>
        <a href="#"><i class="fa fa-twitter"></i></a>
        <a href="#"><i class="fa fa-tripadvisor"></i></a>
        <a href="#"><i class="fa fa-instagram"></i></a>
    </div>
    <ul class="top-widget">
        <li><i class="fa fa-phone"></i> (12) 345 67890</li>
        <li><i class="fa fa-envelope"></i> info.colorlib@gmail.com</li>
    </ul>
</div>

<header class="header-section header-normal">
    <div class="top-nav">
        <div class="container">
            <div class="row">
                <div class="col-lg-6">
                    <ul class="tn-left">
                        <li><i class="fa fa-phone"></i> (12) 345 67890</li>
                        <li><i class="fa fa-envelope"></i> info.colorlib@gmail.com</li>
                    </ul>
                </div>
                <div class="col-lg-6">
                    <div class="tn-right">
                        <div class="top-social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-tripadvisor"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                        </div>
                        <a href="#" class="bk-btn">Booking Now</a>
                        <div class="language-option">
                            <img src="img/flag.jpg" alt="">
                            <span>EN <i class="fa fa-angle-down"></i></span>
                            <div class="flag-dropdown">
                                <ul>
                                    <li><a href="#">Zi</a></li>
                                    <li><a href="#">Fr</a></li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="menu-item">
        <div class="container">
            <div class="row">
                <div class="col-lg-2">
                    <div class="logo">
                        <a href="./index.jsp">
                            <img src="img/logo.png" alt="">
                        </a>
                    </div>
                </div>
                <div class="col-lg-10">
                    <div class="nav-menu">
                        <nav class="mainmenu">
                            <ul>
                                <li><a href="./index.jsp">Home</a></li>
                                <li class="active"><a href="/vendor">Vendor</a></li>
                                <li><a href="about-us.jsp">About Us</a></li>
                                <li><a href="./pages.html">Pages</a>
                                    <ul class="dropdown">
                                        <li><a href="./room-details.html">Room Details</a></li>
                                        <li><a href="./blog-details.html">Blog Details</a></li>
                                        <li><a href="#">Family Room</a></li>
                                        <li><a href="#">Premium Room</a></li>
                                    </ul>
                                </li>
                                <li><a href="./blog.html">News</a></li>
                                <li><a href="./contact.html">Contact</a></li>
                            </ul>
                        </nav>
                        <form class="search-form" action="vendor" method="GET">
                            <div class="input-group">
                                <input class="form-control" type="text" name="searchName"
                                       placeholder="Enter product name...">
                                <div class="input-group-append">
                                    <button class="btn btn-primary" type="submit">Search</button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>

<div class="breadcrumb-section">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumb-text">
                    <h2>Our Rooms</h2>
                    <div class="bt-option">
                        <a href="./home.html">Home</a>
                        <span>Rooms</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<%Room room = (Room) request.getAttribute("room");%>
<section class="room-details-section spad">
    <div class="container">
        <div class="row">
            <div class="col-lg-8">
                <div class="room-details-item">
                    <img src="<%=room.getImage_src()%>" alt="">
                    <div class="rd-text">
                        <div class="rd-title">
                            <h3>Room: <%=room.getNumber_room()%>
                            </h3>

                        </div>
                        <h2><%=room.getPrice()%> VND<span>/Per-hour</span></h2>
                        <table>
                            <tbody>
                            <tr>
                                <td class="r-o">Type:</td>
                                <td><%=room.getType()%>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <p class="f-para"><%=room.getDescription()%>
                        </p>
                    </div>
                </div>

            </div>

            <%--            5.Người dùng nhập thời gian muốn thuê phòng--%>
            <div class="col-lg-4">
                <div class="room-booking">
                    <h3>Your Reservation</h3>
                    <div class="form">
                        <div class="check-date">
                            <label for="date-in">Check In Hour:</label>
                            <input type="text" class="hour-input" id="hour-in">
                        </div>
                        <div class="check-date">
                            <label for="date-in">Check In Date:</label>
                            <input type="text" class="date-input" id="date-in">
                            <i class="icon_calendar"></i>
                        </div>
                        <div class="check-date">
                            <label for="date-out">Check Out Hour:</label>
                            <input type="text" class="hour-input" id="hour-out">
                        </div>
                        <div class="check-date">
                            <label for="date-out">Check Out:</label>
                            <input type="text" class="date-input" id="date-out">
                            <i class="icon_calendar"></i>
                        </div>
                        <div class="message"></div>
                        <div class="total"></div>
                        <button class="check">Check</button>
                        <%--                        11. Người dùng ấn nút Booking now.--%>
                        <div id="button" class="rdt-right">
                            <a href="#">Booking Now</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<footer class="footer-section">
    <div class="container">
        <div class="footer-text">
            <div class="row">
                <div class="col-lg-4">
                    <div class="ft-about">
                        <div class="logo">
                            <a href="#">
                                <img src="img/footer-logo.png" alt="">
                            </a>
                        </div>
                        <p>We inspire and reach millions of travelers<br/> across 90 local websites</p>
                        <div class="fa-social">
                            <a href="#"><i class="fa fa-facebook"></i></a>
                            <a href="#"><i class="fa fa-twitter"></i></a>
                            <a href="#"><i class="fa fa-tripadvisor"></i></a>
                            <a href="#"><i class="fa fa-instagram"></i></a>
                            <a href="#"><i class="fa fa-youtube-play"></i></a>
                        </div>
                    </div>
                </div>
                <div class="col-lg-3 offset-lg-1">
                    <div class="ft-contact">
                        <h6>Contact Us</h6>
                        <ul>
                            <li>(12) 345 67890</li>
                            <li>info.colorlib@gmail.com</li>
                            <li>856 Cordia Extension Apt. 356, Lake, United State</li>
                        </ul>
                    </div>
                </div>
                <div class="col-lg-3 offset-lg-1">
                    <div class="ft-newslatter">
                        <h6>New latest</h6>
                        <p>Get the latest updates and offers.</p>
                        <form action="#" class="fn-form">
                            <input type="text" placeholder="Email">
                            <button type="submit"><i class="fa fa-send"></i></button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="copyright-option">
        <div class="container">
            <div class="row">
                <div class="col-lg-7">
                    <ul>
                        <li><a href="#">Contact</a></li>
                        <li><a href="#">Terms of use</a></li>
                        <li><a href="#">Privacy</a></li>
                        <li><a href="#">Environmental Policy</a></li>
                    </ul>
                </div>
                <div class="col-lg-5">
                    <div class="co-text">
                        <p>
                            Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                            All rights reserved | This template is made with <i class="fa fa-heart"
                                                                                aria-hidden="true"></i> by <a
                                href="https://colorlib.com" target="_blank">Colorlib</a>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</footer>

<div class="search-model">
    <div class="h-100 d-flex align-items-center justify-content-center">
        <div class="search-close-switch"><i class="icon_close"></i></div>
        <form class="search-model-form">
            <input type="text" id="search-input" placeholder="Search here.....">
        </form>
    </div>
</div>

<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/jquery.nice-select.min.js"></script>
<script src="js/jquery-ui.min.js"></script>
<script src="js/jquery.slicknav.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/main.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.1/moment.min.js"></script>
<script>
    const queryString = window.location.search;
    const urlParams = new URLSearchParams(queryString);
    let isValidate = false;
    $('.check').click(function () {
        // 7. Hệ thống lấy thông tin người dùng nhập vào.
        const dateIn = $('#date-in').val();
        const dateOut = $('#date-out').val();
        const hourIn = $('#hour-in').val();
        const hourOut = $('#hour-out').val();

        if (dateIn === "" || dateOut === "" || hourIn === "" || hourOut === "") {
            $('.message').css('color', 'red').text('Fields cannot be left blank.');
            isValidate = false;
            $('#button').css('background', '#94785c');
            return;
        }

        const inputFormat = 'DD MMMM, YYYY';

        const outputFormat = 'YYYY-MM-DD';

        const checkIn = moment(dateIn, inputFormat).format(outputFormat) + 'T' + validate(hourIn) + ':00:00';

        const checkOut = moment(dateOut, inputFormat).format(outputFormat) + 'T' + validate(hourOut) + ':00:00';


        console.log(checkIn);
        console.log(checkOut);

        // 8. Hệ thống gửi thông tin người dùng nhập vào /checkTime.
        $.ajax({
            url: "/checkTime",
            type: "get",
            data: {
                checkIn: checkIn,
                checkOut: checkOut,
                idRoom: urlParams.get('idRoom')
            },
            success: function (response) {
                console.log(response)
                let listResponse = response.replace(/\r/g, "").split(/\n/);
                if (listResponse[0].trim(' ') === 'true') {
                    //10.Hiển thị thông báo thời gian hợp lệ và tổng tiền.
                    $('.message').css('color', 'green').text("It's free time!");
                    isValidate = true;
                    $('#button').css('background', '#dfa974');
                    $('.total').css('color', 'green').text('Total: ' + listResponse[1] + ' VND');
                } else {
                    $('.message').css('color', 'red').text("It's busy!");
                    isValidate = false;
                    $('#button').css('background', '#94785c');
                }
            },
            error: function (xhr) {
            }
        });
    })

    $('#button').click(function () {
        if (!isValidate) return;

        const dateIn = $('#date-in').val();
        const dateOut = $('#date-out').val();
        const hourIn = $('#hour-in').val();
        const hourOut = $('#hour-out').val();

        const inputFormat = 'DD MMMM, YYYY';
        const outputFormat = 'YYYY-MM-DD';

        const checkIn = moment(dateIn, inputFormat).format(outputFormat) + 'T' + validate(hourIn) + ':00:00';
        const checkOut = moment(dateOut, inputFormat).format(outputFormat) + 'T' + validate(hourOut) + ':00:00';
        const idRoom = urlParams.get('idRoom');

        // 12.Hệ thống chuyển người dùng vào đường dẫn /successful
        window.location = "http://localhost:8080/successful?checkIn=" + checkIn + "&checkOut=" + checkOut + "&idRoom=" + idRoom;
    })

    function validate(text) {
        if (text.length < 2) {
            return '0' + text;
        }

        return text;
    }
</script>
</body>

</html>