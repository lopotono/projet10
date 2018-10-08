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
		<h2>Liste des livres</h2>
		<s:iterator value="listLivres">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Titre</th>
						<th>Auteur</th>
						<th>Editeur</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td><s:property value="titre" /></td>
						<td><s:property value="auteur" /></td>
						<td><s:property value="editeur" /></td>
					</tr>
				</tbody>
			</table>
		</s:iterator>
	</div>
	<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
</body>
</html>