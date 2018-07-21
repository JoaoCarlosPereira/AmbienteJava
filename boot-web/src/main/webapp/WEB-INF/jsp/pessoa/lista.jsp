<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de pessoas</title>
</head>
<body>
   <a href="/pessoa/novo"><button type="button">Novo</button></a>
	<table>
		<thead>
			<tr>
				<th>Código</th>
				<th>Nome</th>
				<th>CPF</th>
				<th>Naturalidade</th>
				<th>Ação</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${pessoas}" var="pessoa">
				<tr>
					<td>${pessoa.codigo}</td>
					<td>${pessoa.nome}</td>
					<td>${pessoa.cpf}</td>
					<td>${pessoa.naturalidade.nome}</td>
					<td><a href="/pessoa/visualizar/${pessoa.codigo}"><button type="button">Editar</button></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>