<%-- 
    Document   : Seleccionar
    Created on : 14/11/2016, 01:03:36 PM
    Author     : Willy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css">
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <link rel="stylesheet" href="Css/Style.css"/>
       


    </head>
    <body id="fecbod">

        <form class="form-horizontal" role="form" action="agenda" method="POST">

            <div class="form-group" id="fecha">
                <label class="control-label col-sm-2" >Fecha</label>
                <div class="col-sm-10">
                    <input   class="form-control date"  name="fecha" required   >
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit"   value="Disponibilidad " class="bot" />

                </div>
            </div>
        </form>

    </body>

    <script> $("input.date").datepicker({dateFormat: "dd/mm/yy"});</script>

</html>
