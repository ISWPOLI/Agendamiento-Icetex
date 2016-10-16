<%-- 
    Document   : Registro
    Created on : 16/10/2016, 03:39:30 PM
    Author     : Willy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <%  
     String mej = (String) request.getAttribute("mensaje");   
    %>
    
    
<head>
  <title>Registro</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Registro</h2>
  <form class="form-horizontal" role="form" action="crear" method="POST">
    <div class="form-group">
      <label for="email">Nombre</label>
      <input type="text" class="form-control"  name="nombre" >
    </div>
    <div class="form-group">
      <label for="pwd">Apellido</label>
      <input type="text" class="form-control"   name="apellido" >
    </div>
    <div class="form-group">
      <label for="email">Telefono</label>
      <input type="text" class="form-control"   name="telefono" >
    </div>
      <div class="form-group">
      <label for="email">Tipo documento</label>
      <input type="text" class="form-control"   name="tdoc" >
    </div>
      <div class="form-group">
      <label for="email">Numero de documento</label>
      <input type="text" class="form-control"  name="ndoc" >
    </div>
      <div class="form-group">
      <label for="email">Usuario</label>
      <input type="text" class="form-control"   name="usuario" >
    </div>
      <div class="form-group">
      <label for="email">Contraseña</label>
      <input type="text" class="form-control"   name="cont" >
    </div>
      <div class="form-group">
      <label for="email">correo</label>
      <input type="text" class="form-control"   name="correo" >
    </div>
      
      
    <button type="submit" class="btn btn-default">Agregar</button>
  </form>
  
  <div class="alert alert-success">
      <strong>Exitoso!</strong> <%= mej%> .
  </div>
</div>

</body>
</html>
