<%-- 
    Document   : Agenda
    Created on : 16/10/2016, 03:39:17 PM
    Author     : Willy
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.Entidades.Agenda"%>
<%

    Integer pre = (Integer) request.getAttribute("tamaño");
    Agenda[] cadena = (Agenda[]) request.getAttribute("cadenagenda");

    SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
    String fecha;
    Date fechadate = null;
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



        <script>
            $(document).ready(function () {

                $("a").click(function () {
                    var text = $("#bota").text();
                    alert($("#eso").text(text));
                    var text2 = $("#es").text();
                    $("#eso").text(text);
                    alert(text);
                })


            })

        </script>

    </head>

    <body>

        <div class="container">
            <h2>Agendas Disponibles </h2>
            <div class="list-group">

                <form action="Afinal" method="POST">

                    <%
                        String mdy;

                        for (int y = 0; y <= pre - 1; y++) {

                            fechadate = cadena[y].getFecha();
                            mdy = formato.format(fechadate);
                    %> 


                    <a href="#" class="list-group-item"  id="bota"<%=y%> ><%= "**Fech:  **   " + mdy + "   **Tipo de solicitud**   " + cadena[y].getTipo() + " **Hora** " + cadena[y].getHora()%></a>



                    <% }
                    %>



                    <input type="submit"/>

                    <div id="es">hola </div>
                    <div id="eso">chao </div>
                </form>
            </div>

            <h4>Las agendas se actualizan cada semana  </h4>
        </div>

    </body>
</html>