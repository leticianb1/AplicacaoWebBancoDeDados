<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://bootswatch.com/united/bootstrap.min.css" />
<title>Flores</title>
</head>
<body marginwidth="10px">
	<h1>Incluir Flor</h1>
	<form method="POST" action="WebApp/">
		<div class="col-sm-4">
			<div class="form-group">
			<input type="hidden" name="id" value="${ flor.id }" />
				<label>Nome:</label> <input type="text" value="${ flor.nome }" id="nome" name="nome"
					class="form-control">
			</div>
			<div class="form-group">
				<label>Cor:</label> <input type="text" id="cor" name="cor" value="${ jogo.cor }"
					class="form-control">
			</div>
			<div class="form-group">
				<label>Nome Científico:</label> <input type="text" id="cientifico" name="cientifico" value="${ jogo.nomeCientifico }"
					class="form-control">
			</div>
			<button class="btn" type="submit">Salvar</button>
			<a href="lista">Cancelar</a>
		</div>
	</form>
</body>
</html>