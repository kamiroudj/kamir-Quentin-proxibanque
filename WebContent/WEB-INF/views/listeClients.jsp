<%@include file="header.jsp" %>
<div class="container">

<div class="container-fluid">

<div class="widget-header">
	<h3>Liste des clients</h3>
</div> 


	<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Numéro</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Adresse</th>
      <th scope="col">Nature</th>
      <th scope="col">
      	<div class="action">Actions</div>
      	<div class="actions"><div><label>modifier</label></div><div><label >supprimer</label></div><div><label >les comptes</label></div></div>
      </th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row">1</th>
      <td>Mark</td>
      <td>Otto</td>
      <td>@mdo</td>
       <td>@mdo</td>
       <td>
	       <div class="actions">
	       <div><img class="CRUDIcons" href="" alt="logoModifier" src="images/update-icon.png"></div>
	       <div><img class="CRUDIcons" href="" alt="logoSupprimer" src="images/delete-icon.png"></div>
	       <div><img class="CRUDIcons" href="" alt="logoListComptes" src="images/list-icon.png"></div>
	       </div>
       </td>
    </tr>
    <tr>
      <th scope="row">2</th>
      <td>Jacob</td>
      <td>Thornton</td>
      <td>@fat</td>
       <td>@mdo</td>
       <td>@mdo</td>
    </tr>
    <tr>
      <th scope="row">3</th>
      <td colspan="2">Larry the Bird</td>
      <td>@twitter</td>
       <td>@mdo</td>
       <td>@mdo</td>
    </tr>
  </tbody>
</table>
</div> 
</div> 
</body>
</html>