<%-- 
    Document   : Registro
    Created on : 14/10/2016, 09:05:49 PM
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
      <label for="email">Numero Documento</label>
      <input type="text" class="form-control"   name="documento" >
    </div>
      <div class="form-group">
      <label for="email">Direccion</label>
      <input type="text" class="form-control"   name="direccion" >
    </div>
      <div class="form-group">
      <label for="email">Telefono</label>
      <input type="text" class="form-control"  name="telefono" >
    </div>
      <div class="form-group">
      <label for="email">Tipo de sexo</label>
      <input type="text" class="form-control"   name="tsex" >
    </div>
      <div class="form-group">
      <label for="email">Escoja usuario</label>
      <input type="text" class="form-control"   name="usuario" >
    </div>
      <div class="form-group">
      <label for="email">Contraseña</label>
      <input type="password" class="form-control"   name="pass" >
    </div>
      
      
    <button type="submit" class="btn btn-default">Agregar</button>
  </form>
  
  <div class="alert alert-success">
      <strong>Exitoso!</strong> <%= mej%> .
  </div>
</div>

</body>
</html>
