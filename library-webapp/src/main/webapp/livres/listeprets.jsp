<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="stylelist.css" />
</head>
<body>

	<nav aria-label="breadcrumb">
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><s:a action="index">ACCUEIL</s:a></li>
			<li class="breadcrumb-item active" aria-current="page">LISTE DES
				PRETS</li>
			<li class="breadcrumb-item" aria-current="pageUser">Utilisateur
				connecté : <s:property value="#session.user.name" />
			</li>
			<li class="font-weight-bold"><s:if test="hasActionMessages()">
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
				<th>Date du prêt</th>
				<th>Date de fin du prêt</th>
				<th>Etat du prêt</th>
				<th>Prolonger le prêt</th>
			</tr>
		</thead>
		<%
			java.text.DateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");
		%>
		<h5>
			Date du jour :
			<%=df.format(new java.util.Date())%>
		</h5>

		<s:iterator value="listPrets">
			<tr>
				<td><s:property value="livre.titre" /></td>
				<td><s:date name="datedebut" format="dd/MM/yyyy" /></td>
				<td><s:date name="datefin" format="dd/MM/yyyy" /></td>
				<td><s:property value="etat" /></td>
				<s:if test="etat=='en cours'">
					<td><s:url action="datepro" var="prolongerlink">
							<s:param name="id">
								<s:property value="id" />
							</s:param>
						</s:url>
						<h3>
							<a href="${prolongerlink}" class="badge badge-primary">PROLONGER</a>
						</h3></td>
				</s:if>
				<s:else>
					<td><h3>
							<span class="badge badge-danger">PROLONGATION</span>
						</h3></td>
				</s:else>
			</tr>
		</s:iterator>
	</table>

	<div class="jumbotron">
		<div class="container">
			<h6>
			<s:form action="rappel" >
				<s:checkbox name="option" key="#session.user.option" value="#session.user.option"
					label="Option pour le rappel de fin de prêt." />
					<s:submit />
			</s:form>
			</h6>							
		</div>
	</div>

</body>
</html>