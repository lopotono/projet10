<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link href="css/bootstrap.css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="stylelist.css" />
</head>
<body>

	<table id="list">
		<tr>
			<th>TITRE</th>
			<th>AUTEUR</th>
			<th>EDITEUR</th>
			<th>EXEMPLAIRES</th>
		</tr>
		<s:iterator value="listLivres">

			<tbody>
				<tr>
					<td><s:property value="titre" /></td>
					<td><s:property value="auteur" /></td>
					<td><s:property value="editeur" /></td>
					<td><s:property value="nbexemplaire" /></td>
				</tr>
			</tbody>
		</s:iterator>
	</table>

	<s:a action="index" class="btn btn-primary btn-md pull-left">Retour accueil</s:a>
</body>
</html>