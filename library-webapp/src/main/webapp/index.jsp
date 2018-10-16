<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<%@ include file="./_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="style1.css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

	<div class="navbar">
		<s:a action="index" class="active">
			<i class="fa fa-fw fa-home"></i> ACCUEIL</s:a>
		<s:a action="livres_list">
			<i class="fa fa-fw fa-book"></i> LISTE DES LIVRES</s:a>
		<s:if test="#session.user">
			<s:a action="pret_list">
				<i class="fa fa-fw fa-eye"></i>LISTE DES PRETS</s:a>
		</s:if>

		<s:if test="#session.user">
	Utilisateur connecté :
	<s:property value="#session.user.name" />
			<s:a action="logout">
				<i class="fa fa-fw fa-user"></i>DECONNEXION</s:a>
		</s:if>
		<s:else>
			<s:a action="login">
				<i class="fa fa-fw fa-user"></i>CONNEXION</s:a>
		</s:else>
	</div>
	<br />
	<div class="container">
		<div id="content" class="row">
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/frankenstein.jpg" alt="frankenstein"
					class="img-rounded" width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/germinal.jpg" alt="germinal" class="img-rounded"
					width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/crocblanc.jpg" alt="crocblanc" class="img-rounded"
					width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/LestroisMousquetaires.jpg" alt="Mousquetaires"
					class="img-rounded" width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/madamebovary.jpg" alt="bovary" class="img-rounded"
					width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/shining.jpg" alt="shining" class="img-rounded"
					width="180" height="250">
			</div>

			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/singes.jpg" alt="singes" class="img-rounded"
					width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/tour.jpg" alt="tour" class="img-rounded"
					width="180" height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/poe.jpg" alt="poe" class="img-rounded" width="180"
					height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/vie.jpg" alt="vie" class="img-rounded" width="180"
					height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/451.jpg" alt="451" class="img-rounded" width="180"
					height="250">
			</div>
			<div class="col-xs-4 col-sm-3 col-md-2">
				<img src="images/robots.jpg" alt="robots" class="img-rounded"
					width="180" height="250">
			</div>
		</div>
	</div>
	
	<s:form action="search_livre" method="post" class="form-horizontal">
		<div class="form-group">
			<div class="col-md-8">
				<s:textfield name="titre" requiredLabel="true"
					placeholder="Rechercher" class="form-control" />
				<s:submit value="RECHERCHER" class="btn btn-success btn btn-success" />
			</div>
		</div>
	</s:form>
</body>
</html>