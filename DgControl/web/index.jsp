<%-- 
    Document   : index
    Created on : 16/10/2016, 03:39:39 PM
    Author     : Willy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Agendamiento Icetex</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Home</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Agenda  <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li>
                                <form class="form-horizontal" role="form" action="agenda" method="POST">

                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">

                                            <input type="submit"   value="Disponibilidad " />
                                        </div>
                                    </div>
                                </form>


                            </li>

                        </ul>

                    </li>
                    
                </ul>
            </div>
        </nav>

        <div class="container">
            <h3>Bienvenidos a nuestra aplicación </h3>
            <p>Nos mueve la ingenieria </p>
        </div>

    </body>
</html>