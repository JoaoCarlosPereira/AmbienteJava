<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<label for="nome">Nome</label>
<br />
<input type="text" name="nome" id="nome" value="${pessoa.nome}" />
<br />
<form:errors path="pessoa.nome" />
<label for="cpf">CPF</label>
<br />
<input type="text" name="cpf" id="cpf" value="${pessoa.cpf}" />
<br />
<form:errors path="pessoa.cpf" />

<label for="naturalidade">Naturalidade</label>
<br />
<select name="naturalidade.codigo">
	<option></option>
	<c:forEach items="${cidades}" var="cidade">
		<c:set var="selecionado" value="" />
		<c:if test="${cidade.codigo eq pessoa.naturalidade.codigo}">
			<c:set var="selecionado" value="selected" />
		</c:if>
		<option value="${cidade.codigo}" ${selecionado}>${cidade.nome}</option>
	</c:forEach>
</select>