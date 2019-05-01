<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<link type="text/css" rel="stylesheet" href="stylelist.css" />
</head>
<body>

	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><s:a action="index">ACCUEIL</s:a></li>
			<li class="breadcrumb-item"><s:a action="livres_list">LISTE DES
				LIVRES DE LA BIBLIOTHEQUE</s:a></li>
			<li class="breadcrumb-item active" aria-current="page">LISTE
				D'ATTENTE DES LIVRES</li>
			<li class="breadcrumb-item" aria-current="pageUser">Utilisateur
				connecté : <s:property value="#session.user.name" />
			</li>
			<li><s:if test="hasActionMessages()">
					<s:actionmessage />
				</s:if></li>
			<li class="font-weight-bold"><s:if test="hasActionErrors()">
					<s:actionerror />
				</s:if></li>
		</ol>
	</nav>

	<table id="list">

		<thead>
			<tr>
				<th>Titre du livre</th>
				<th>Date de réservation</th>
				<th>Position liste d'attente</th>
				<th>Etat de la réservation</th>
				<th>Date de retour</th>
				<th>Annuler la réservation</th>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="listReservation">
				<tr>
					<td><s:property value="livre.titre" /></td>
					<td><s:property value="datereservation" /></td>
					<td><s:property value="position" /></td>
					<td><s:property value="etat" /></td>
					<td></td>
					<td><s:url action="annuler" var="annulerlink">
							<s:param name="id">
								<s:property value="id" />
							</s:param>
						</s:url>
						<h3>
							<a href="${annulerlink}" class="badge badge-danger">ANNULER</a>
						</h3></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>