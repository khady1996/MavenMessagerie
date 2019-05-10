<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="eu.ensup.messagerie.domaine.User" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Résultat Envoi du message </title>
</head>
<body>

	<%
	
		User u = (User) session.getAttribute("utilisateur");
	
	%>

	<h1> Informations utilisateur </h1>
	<ul>
	
		<li> Login : <%= u.getName() %>
		<li> Email : <%= u.getMail() %>
	
	</ul>
</body>
</html>