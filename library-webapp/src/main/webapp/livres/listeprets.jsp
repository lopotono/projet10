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
				<th>Livre</th>
				<th>Date du prêt</th>
				<th>Date de fin du prêt</th>
				<th>Etat du prêt</th>
				<th>Prolonger le prêt</th>
			</tr>
		</thead>
		<tbody>
		<caption>
			<s:property value="#session.user.name" />
		</caption>
		<s:iterator value="listPrets">
			<tr>
				<td><s:property value="livre.id_livre" /></td>
				<td><s:date name="datedebut" format="dd/MM/yyyy" /></td>
				<td><s:date name="datefin" format="dd/MM/yyyy" /></td>
				<td><s:property value="etat" /></td>
				<s:if test="etat=='en cours'">
					<td><s:url action="datepro" var="prolongerlink">
							<s:param name="id">
								<s:property value="id" />
							</s:param>
						</s:url><a href="${prolongerlink}" class="label label-success">PROLONGER</a>
					</td>
				</s:if>
				<s:else>
					<td><span class="badge badge-secondary">X</span></td>
				</s:else>
			</tr>
		</s:iterator>
		</tbody>
	</table>

</body>
</html>