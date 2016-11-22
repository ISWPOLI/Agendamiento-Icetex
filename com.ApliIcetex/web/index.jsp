<%-- 
    Document   : index
    Created on : 16/10/2016, 03:39:39 PM
    Author     : Willy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%

String nom = (String) request.getAttribute("nombre");
String em =(String) request.getAttribute("correo");

session.setAttribute("correo", em);

%>



<!DOCTYPE html>
<html lang="en">
    <head>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="Css/Style.css"/>
        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script>
             $(document).ready(function () {

            $("#cor").css("display", "none");

            })
            
        </script>
        
        
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="#">Agendamiento Icetex</a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">DG</a></li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Agenda  <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li>
                                <form class="form-horizontal" role="form" action="seleccionar" method="POST">

                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <input type="submit"   value="Disponibilidad " class="bot" />
                                                                                         
                                        </div>
                                    </div>
                                </form>


                            </li>

                        </ul>

                    </li>
                    <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Reportes  <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li>
                                <form class="form-horizontal" role="form" action="seleccionar" method="POST">

                                    <div class="form-group">
                                        <div class="col-sm-offset-2 col-sm-10">
                                            <input type="submit"   value="Reporte Eliminados" class="bot" />
                                                                                         
                                        </div>
                                    </div>
                                </form>


                            </li>

                        </ul>

                    </li>
                    <li class="active"><a href="Login.jsp">Salir</a></li>
                    
                </ul>
            </div>
        </nav>

        <div class="container">
            <h1>Bienvenido a agendamiento en linea  </h1>
            <h2><%=nom%></h2>
            <input type="text" value="<%=em%> " id="cor" disabled="disabled" name="em"/>
            <h4>Nos mueve la ingenieria </h4>
        </div>
            
            

    </body>
</html>