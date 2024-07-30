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
      <li class="nav-item active"><a class="nav-link" href="readAll.jsp">ReadAll</a></li>
      <li class="nav-item active"><a class="nav-link" href="readById.jsp">ReadById</a></li>
      <li class="nav-item active"><a class="nav-link" href="readByName.jsp">ReadByName</a></li>
      <li class="nav-item active"><a class="nav-link" href="readByType.jsp">ReadByType</a></li>
      <li class="nav-item active"><a class="nav-link" href="updatePriceByBrandAndId.jsp">UpdatePriceByBrandAndId</a></li>
      <li class="nav-item active"><a class="nav-link" href="deleteByPriceBrandAndId.jsp">DeletePriceByBrandAndId</a></li>
    </ul>
  </div>
</nav>

<!--$ is jsdl for back end to front end message in model in contoller  -->
<h1 style="color: green "><i>${save}</i> </h1>
<form class ="container w-25 p-1" action="/save" method="post">
  <div class="form-group">
    <label for="brandID">ID</label>
    <input type="number" class="form-control" id="brandID" placeholder="Enter id" name="id">
  </div>
  <div class="form-group">
    <label for="brandName">Brand</label>
    <input type="text" class="form-control" id="brandName" placeholder="Enter brand" name="brand">
  </div>
  <div class="form-group">
    <label for="brandType">Type</label>
    <input type="text" class="form-control" id="brandType" placeholder="Enter type" name="type">
  </div>
  <div class="form-group">
    <label for="brandQty">Quantity</label>
    <input type="number" class="form-control" id="brandQty" placeholder="Enter qty" name="qty">
  </div>
  <div class="form-group">
    <label for="brandPrice">Price</label>
    <input type="number" class="form-control" id="brandPrice" placeholder="Enter price" name="price">
  </div>
  <br>
  <div style="text-align: center">
    <button type="submit" class="btn btn-primary">Submit</button> &nbsp; <button type="reset" class="btn btn-primary">Reset</button>
  </div>
</form>

</body>
</html>
