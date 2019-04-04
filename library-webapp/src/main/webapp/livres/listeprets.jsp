<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="stylelist.css" />
</head>
<body>
	<s:a action="index">
		<h2>
			<span class="badge badge-secondary">ACCUEIL</span>
		</h2>
	</s:a>
	<h3>
		<s:property value="#session.user.name" />
	</h3>
	<table id="list">
		<thead>
			<tr>
				<th>Titre du livre</th>
				<th>Date du prêt</th>
				<th>Date de fin du prêt</th>
				<th>Etat du prêt</th>
				<th>Prolonger le prêt</th>
			</tr>
		</thead>
		<%java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy"); %>
		<h3>Date du jour : <%= df.format(new java.util.Date()) %> </h3>
		
		<s:iterator value="listPrets">
			<tr>
				<td><s:property value="livre.titre" /></td>
				<td><s:date name="datedebut" format="dd/MM/yyyy" /></td>
				<td><s:date name="datefin" format="dd/MM/yyyy" />
				<td><s:property value="etat" /></td>
				<s:if test="etat=='en cours'">
					<td><s:url action="datepro" var="prolongerlink">
							<s:param name="id">
								<s:property value="id" />
							</s:param>
						</s:url>
						<h2>
							<a href="${prolongerlink}" class="badge badge-primary">PROLONGER</a>
						</h2></td>
				</s:if>
				<s:else>
					<td><h2>
							<span class="badge badge-danger">TERMINÉ</span>
						</h2></td>
				</s:else>
			</tr>
		</s:iterator>
	</table>
</body>
</html>
