<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="../_include/head.jsp"%>
</head>
<body>
	<h2>Liste des livres</h2>

	<ul>
		<s:iterator value="listLivres">
			<table>
				<tr>
					<td><s:property value="titre" /></td>
					<td><s:property value="auteur" /></td>
					<td><s:property value="editeur" /></td>
				</tr>
			</table>
		</s:iterator>
	</ul>
</body>
</html>