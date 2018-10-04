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
	<div class="container">
		<header class="page-header">
			<h1>Bibliothèque</h1>
		</header>
		<section class="row">
			<ul class="nav navbar-nav">
				<li class="active"><s:a action="index">ACCUEIL</s:a></li>
				<li><s:a action="livres_list">LISTE DES LIVRES</s:a></li>
				<li><a href="">PRET DE LIVRES</a></li>
				<li><a href="">LISTE DES PRETS</a></li>
			</ul>
		</section>
	</div>

	<s:form action="search" method="post" id="">
		<s:textfield name="name" requiredLabel="true" placeholder="Recherche"
			id="search" />
		<s:submit value="Chercher" id="search-btn" />
	</s:form>
	<section>
		<article></article>
		<aside></aside>
	</section>
</body>
</html>