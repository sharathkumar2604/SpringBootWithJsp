<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="welcome.jsp">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active"><a class="nav-link" href="save.jsp">Save</a></li>
      <li class="nav-item active"><a class="nav-link" href="readById.jsp">ReadById</a></li>
      <li class="nav-item active"><a class="nav-link" href="readAll.jsp">ReadAll</a></li>
      <li class="nav-item active"><a class="nav-link" href="readByType.jsp">ReadByType</a></li>
      <li class="nav-item active"><a class="nav-link" href="updatePriceByBrandAndId.jsp">UpdatePriceByBrandAndId</a></li>
      <li class="nav-item active"><a class="nav-link" href="deleteByPriceBrandAndId.jsp">DeletePriceByBrandAndId</a></li>
    </ul>
    
  </div>
</nav>


<h1 style="color: green "><i>${sss}</i> </h1>

<form action="readByBrand" method="get">

<input type="text" name="brand" placeholder="enter brand">
<br>
<button type="submit" >search</button>

</form>

</body>
</html>