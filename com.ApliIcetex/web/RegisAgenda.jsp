<%-- 
    Document   : RegisAgenda
    Created on : 30/10/2016, 06:55:48 PM
    Author     : Willy
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%

    String dat = (String) request.getAttribute("texagend");
    String correo = (String) request.getAttribute("correo");

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensage de confirmacion </title>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="Css/Style1.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <div class="container">
            <h2>Gracias por utilizar nuestro servicio </h2>



            <div class="alert alert-warning" id="agenda">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Hecho !</strong> <h2>Tu agenda es <%=dat%>.</h2>
            </div>
            <div class="alert alert-success" id="info">
                <a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Recuerda !</strong> Se ha enviado un mensaje a tu cuenta de correo inscrita confirmando tu agenda seleccionada.
            </div>

            <div class="alert alert-info" id="salir">
                <a href="http://localhost:8083/com.ApliIcetex/Login.jsp" class="close" data-dismiss="alert" aria-label="close">&times;</a>
                <strong>Salir!</strong> 
            </div>


            
        </div>
    </body>
</html>
