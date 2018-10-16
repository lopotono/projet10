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
	<s:a action="index">
		<span class="badge badge-secondary">ACCUEIL</span>
	</s:a>

	<table id="list">
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
				<th>Etat du prêt</th>
				<th>Prolonger le prêt</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="listPrets">
				<tr>
					<td><s:property value="titre" /></td>
					<td><s:property value="datedebut" /></td>
					<td><s:property value="datefin" /></td>
					<td><s:property value="etat" /></td>
					<td><s:submit value="prolongation" action="datepro"
							class="btn btn-success" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>

</body>
</html>