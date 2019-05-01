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

		<thead>
			<tr>
				<th>Titre du livre</th>
				<th>Date de fin du prêt</th>
				<th>Nombre de personnes</th>
			</tr>
		</thead>
		<s:iterator value="reservation">
			<tr>
				<td><s:property value="livre.titre " /></td>
				<td><s:date name="datefin" format="dd/MM/yyyy" /></td>
				<td><s:property value="reservation.personnemax" /></td>
				<td><s:url action="reserver" var="reserverlink">
						<s:param name="id">
							<s:property value="id" />
						</s:param>
					</s:url><a href="${reserverlink}" class="label label-success">RESERVER</a>
				</td>
			</tr>
		</s:iterator>
	</table>

</body>
</html>