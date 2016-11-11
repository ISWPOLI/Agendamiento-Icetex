<%-- 
    Document   : Agenda
    Created on : 16/10/2016, 03:39:17 PM
    Author     : Willy
--%>

<%@page import="com.Entid.Agenda"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<%

    Integer pre = (Integer) request.getAttribute("tamaño");
    Agenda[] cadena = (Agenda[]) request.getAttribute("cadenagenda");
    String correo = (String)request.getAttribute("correo");
    
    session.setAttribute("correo", correo);

    SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
     
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
         <link rel="stylesheet" href="Css/Style1.css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



        <script>
            $(document).ready(function () {

                $("input[name=edad]").click(function () {    
	    //alert("Bien!!!, la edad seleccionada es: " + $('input:radio[name=edad]:checked').val());
            var text2 = $('input:radio[name=edad]:checked').val();
            alert("Las agendas se actualizan cada semana"+ text2);
            
            $("#eso").val(text2);
           
	     
         });
         $("#em").css("display", "none");

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


                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Id Agenda</th>
                                 <th>Fecha</th>
                                  <th>Tipo</th>
                                   <th>Hora</th>
                               
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input type="radio" name="edad" value="<%= " "+cadena[y].getIdAgenda()+" "+ mdy+" "+cadena[y].getTipo() +" "+cadena[y].getHora()%>"><%= " "+cadena[y].getIdAgenda()%></td>
                                <td><input type="text" name="edad" value="<%= mdy%>"  disabled="disabled"></td>
                                <td><input type="text" name="edad" value="<%= cadena[y].getTipo()%>" disabled="disabled"></td>
                                <td><input type="text" name="edad" value="<%=  cadena[y].getHora()%>" disabled="disabled"></td>
                            </tr>
                           
                        </tbody>
                    </table>
   

                    <% }
                    %>

                    <div id="es"><h3>Agenda seleccionada es </h3> </div>
                    <input type="text" class="form-control" id="eso"  name="texto">
                    <input type="text" class="form-control" id="em" value="<%= correo%>"  name="texto">
                    
                    <input type="submit"/>

                </form>


            </div>

            
        </div>

    </body>
</html>