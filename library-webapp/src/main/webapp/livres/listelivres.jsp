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
			<li class="breadcrumb-item active" aria-current="page">LISTE DES
				LIVRES DE LA BIBLIOTHEQUE</li>
			<li class="breadcrumb-item" aria-current="pageUser">Utilisateur
				connecté : <s:property value="#session.user.name" />
			</li>
		</ol>
	</nav>

	<table id="list">
		<tr>
			<th>TITRE DU LIVRE</th>
			<th>AUTEUR DU LIVRE</th>
			<th>NOMBRE EXEMPLAIRES</th>
			<th>DISPONIBLE</th>
			<s:if test="#session.user">
				<th>RESERVER UN LIVRE</th>
			</s:if>
			<s:else>
				<th></th>
			</s:else>
		</tr>
		<s:iterator value="listLivres">
			<tbody>
				<tr>
					<td><s:property value="titre" /></td>
					<td><s:property value="auteur" /></td>
					<td><s:property value="personnemax" /></td>
					<td><s:if test="disponible==false">
							<h4><p class="text-danger">NON</p></h4>
							<s:if test="#session.user">
								<td><s:url action="reserverLivre" var="reserverlink">
										<s:param name="livreid">
											<s:property value="livreid" />
										</s:param>
										<s:param name="id">
											<s:property value="#session.user.id" />
										</s:param>
									</s:url>
									<h3>
										<a href="${reserverlink}" class="badge badge-primary">RESERVER</a>
									</h3></td>
							</s:if>
						</s:if> <s:if test="disponible==true">
							<h4><p class="text-success">OUI</p></h4>				
						</s:if>					
				</tr>
			</tbody>
		</s:iterator>
	</table>
</body>
</html>
