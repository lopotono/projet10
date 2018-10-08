<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<h2>Liste des prêts</h2>
		<table class="table table-striped">
			<caption>
				<p>
					LISTE DES PRETS DES LIVRES DE
					<s:property value="#session.user.name" />
				</p>
			</caption>
			<thead>
				<tr>
					<th>Livre</th>
					<th>Date du prêt</th>
					<th>Date de fin du prêt</th>
				</tr>
			</thead>
			<tbody>
			<s:iterator value="listPret">
				<tr>
					<td><s:property value="titre"/></td>
					<td><s:date name="datedebut" format="dd/MM/yyyy" /></td>
					<td><s:date name="datefin" format="dd/MM/yyyy" /></td>
				</tr>
				</s:iterator>
			</tbody>
		</table>
		<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
	</div>

</body>
</html>