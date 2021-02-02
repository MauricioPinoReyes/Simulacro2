<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Bootstrap 4 online</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
     integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
      crossorigin="anonymous">

      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="bg-light">

<h1>Warehouse</h1>
<form action="procesar" method="post">
	 Almacen:<input type="text" name="txtIdWarehouse" />
	<input type="submit" value="Obtener" />
</form>

<br>
<br>
<br>

<form action="procesar" method="post">
	 Categoria:<input type="text" name="txtIdWarehouse" />
	<input type="submit" value="Obtener" />
</form>

<br/>
<table>
	<tr>
		<th>Almacen</th>
		<th>ID Producto</th>
		<th>Nombre Producto</th>
		<th>Precio Lista</th>
		<th>Costo Estandar</th>
		<th>Inventario</th>
	</tr>
	<c:forEach items="${inv}" var="detinv">     
	<tr>
		<td><c:out value="${detinv.getWarwhouse().getWarehouseName()}"/></td>
		<td><c:out value="${detinv.getProduct().getProductId()}"/></td>
		<td><c:out value="${detinv.getProduct().getProductName()}"/></td>
		<td><c:out value="${detinv.getProduct().getListPrice()}"/></td>
		<td><c:out value="${detinv.getProduct().getStandarsCost()}"/></td>
		<td><c:out value="${detinv.getQuantity()}"/></td>		
	</tr>
	</c:forEach>
</table> 
<br/>




</body>
</html>