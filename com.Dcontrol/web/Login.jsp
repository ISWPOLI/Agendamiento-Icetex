<%-- 
    Document   : Login
    Created on : 14/10/2016, 09:25:02 PM
    Author     : Willy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>

        <div class="container">
            <h2>Ingreso Agendamiento</h2>
            <form class="form-horizontal" role="form" action="login" method="POST">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="email">Usuario</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="email" placeholder="User" name="user">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2" for="pwd">Password:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pass">
                    </div>
                </div>
                <ul class="pager">
                    <li><a href="Registro.jsp">Si no estas registrado da click aca</a></li>
                    
                </ul>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-default">Enviar</button>
                    </div>
                </div>
            </form>
        </div>

    </body>
</html>