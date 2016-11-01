<%-- 
    Document   : RegisAgenda
    Created on : 30/10/2016, 06:55:48 PM
    Author     : Willy
--%>

<%@page import="com.Servlets.Email"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%

String dat = (String) request.getAttribute("texagend");
String correo =(String) request.getAttribute("correo");
String clave =(String) request.getAttribute("clave");
String de =(String) request.getAttribute("de");
String asunto =(String) request.getAttribute("asunto");


Email email = new Email();
String para  = correo;
String mensaje = dat;


boolean rest =email.enviarCorreo(de, clave, para, mensaje, asunto);

if (rest){
    out.print("correo enviado");
}else{
     out.print("correo  no enviado");
}


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=dat%>+<%=correo%> </h1>
    </body>
</html>
