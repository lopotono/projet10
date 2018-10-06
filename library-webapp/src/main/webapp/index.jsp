<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
	<div class="container-fluid">
		<div class="navbar navbar-default navbar-fixed-top">
			<div class="navbar-header">
				<div class="navbar-brand">Bibliothèque</div>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><s:a action="index">ACCUEIL</s:a></li>
				<li><s:a action="livres_list">LISTE DES LIVRES</s:a></li>
				<s:if test="#session.user">
					<li><s:a action="">PRET DE LIVRES</s:a></li>
					<li><s:a action="pret_livre">LISTE DES PRETS</s:a></li>
				</s:if>
				<li><%@ include file="./_include/header.jsp"%></li>
			</ul>
		</div>
		<s:form action="search" method="post" id="searchthis">
			<s:textfield name="name" requiredLabel="true"
				placeholder="Rechercher" id="search" />
			<s:submit value="RECHERCHER" id="search-btn" />
		</s:form>
	</div>
</body>
</html>