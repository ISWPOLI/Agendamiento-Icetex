<%-- 
    Document   : Agenda
    Created on : 16/10/2016, 03:39:17 PM
    Author     : Willy
--%>

<%@page import="java.util.StringTokenizer"%>
<%@page import="com.Entid.Agenda"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>

<%

    Integer pre = (Integer) request.getAttribute("tamaño");
    Agenda[] cadena = (Agenda[]) request.getAttribute("cadenagenda");
    String correo = (String) request.getAttribute("correo");
    String fecha1 = (String) request.getAttribute("dfecha");

    session.setAttribute("correo", correo);

    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    Date fechadate = null;
%>




<html lang="en">
    <head>
        <title>Agendas</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script type="text/javascript" src="../js/jquery-1.4.2.min.js"></script>  
        <script type="text/javascript" src="../jalert/jquery.alerts.js"></script>  
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="Css/Style.css"/>


        <script>
            $(document).ready(function () {

                $("input[name=edad]").click(function () {
                    //alert("Bien!!!, la edad seleccionada es: " + $('input:radio[name=edad]:checked').val());
                    var text2 = $('input:radio[name=edad]:checked').val();
                    alert("Las agendas se actualizan cada semana" + text2);

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






                <form action="Afinal" method="POST" id="formulario">

                    <%
                        String mdy, fech1, fech2;
                        int cont = 0;

                        for (int y = 0; y <= pre - 1; y++) {

                            fechadate = cadena[y].getFecha();
                            mdy = formato.format(fechadate);

                            StringTokenizer st1 = new StringTokenizer(fecha1, "/");
                            StringTokenizer st = new StringTokenizer(mdy, "/");
                            fech1 = st.nextToken();
                            fech2 = st1.nextToken();

                            if (fech1.equals(fech2)) {

                                cont = cont + 1;
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
                                <td><input type="radio" name="edad" value="<%= " " + cadena[y].getIdAgenda() + " " + mdy + " " + cadena[y].getTipo() + " " + cadena[y].getHora()%>"><%= " " + cadena[y].getIdAgenda()%></td>
                                <td><input type="text" name="edad" value="<%= mdy%>"  disabled="disabled"></td>
                                <td><input type="text" name="edad" value="<%= cadena[y].getTipo()%>" disabled="disabled"></td>
                                <td><input type="text" name="edad" value="<%=  cadena[y].getHora()%>" disabled="disabled"></td>

                            </tr>


                        </tbody>
                    </table>


                    <% }

                        }
                        if (cont == 0) {%>

                    <h1>No existe agenda </h1>
                    <a href="Seleccionar.jsp" class="btn btn-info" role="button" id="volver">Volver a la seleccion de fecha </a>
                    <a href="Login.jsp" class="btn btn-info" role="button" id="exit">Salir </a>

                    <script>
                        $(document).ready(function () {

                            $("#es").css("display", "none");
                            $("#enviar").css("display", "none");
                        })</script>
                    
                    

                    <%
                        }
                    %>

                    <div id="es"><h3>Agenda seleccionada es </h3>
                        <input type="text" class="form-control" id="eso"  name="texto" required>
                        <input type="text" class="form-control" id="em" value="<%= correo%>"  name="texto">
                    </div>

                    <input type="submit" value="Enviar" id="enviar"/>

                </form>

            </div>


        </div>

    </body>
</html>