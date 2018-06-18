<%@include file="header1.jsp" %>
<div class="container">

<div class="container-fluid">

<div class="widget-header">
	<h3>Liste des clients</h3>
</div>
<a href="<c:url value="/listClient" />"><input type="button" value="lister les clients"></a>
<div>

</div>
	<table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Numéro</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Adresse</th>
      <th scope="col">
      	<div class="action">Actions</div>
      	<div class="actions"><div><label>modifier</label></div><div><label >supprimer</label></div><div><label >les comptes</label></div></div>
      </th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="client" items="${clients}">
    <tr>

      <th scope="row">${client.id}</th>
      <td>${client.nom}</td>
      <td>${client.prenom}</td>
      <td>${client.adresse}</td>
       <td>
	      <%--  <div class="actions">
	       <div><a href="<c:url value="/updateClient" />"><img class="CRUDIcons"  alt="logoModifier" src="images/update-icon.png" /></a></div>
	       <div><a href="<c:url value="/deleteClient" />"><img class="CRUDIcons"  alt="logoSupprimer" src="images/delete-icon.png" /></a></div>
	       <div><a href="<c:url value="/listClient" />"><img class="CRUDIcons" alt="logoListComptes" src="images/list-icon.png" /></a></div>
	       </div> --%>
	       <div class="actions">
	       <div><a href="<c:url value="/updateClient" />">modifier</a></div>
	       <div><a href="<c:url value="/deleteClient" />">supprimer</a></div>
	       <div><a href="<c:url value="/listClient" />">listeComptes</a></div>
	       </div>
       </td>
     
    </tr>
          
  	</c:forEach>
  </tbody>
</table>
</div> 
</div> 
</body>
</html>