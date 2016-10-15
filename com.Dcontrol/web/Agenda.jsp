<%-- 
    Document   : Agenda
    Created on : 14/10/2016, 09:04:02 PM
    Author     : Willy
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page import="com.Entidades.Agenda"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="ftm" uri="http://java.sun.com/jstl/fmt" %>
<!DOCTYPE html>

<%

    Integer pre = (Integer) request.getAttribute("tamaño");
    Agenda[] cadena = (Agenda[]) request.getAttribute("cadenagenda");

%>




<html lang="en">
    <head>
        <title>Agendas</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>  
        <script type="text/javascript" src="../jalert/jquery.alerts.js"></script>  
        <link href="../jalert/jquery.alerts.css" rel="stylesheet" type="text/css" />  
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
       
    </head>
    <body>

        <div class="container">
            <h2>Agendas Disponibles </h2>
            <div class="list-group">


                <%for (int y = 0; y <= pre - 1; y++) {%>  

                <a href="index.jsp" class="list-group-item" id="bota" ><%= "**Fecha:  **   "+cadena[y].getFecha() +"   **Tipo de solicitud**   "+cadena[y].getTsolicit()+" **Hora** "+ cadena[y].getHora() %></a>

                <% }
                %>

            </div>

            <h4>Las agendas se actualizan cada semana  </h4>
        </div>

    </body>
</html>