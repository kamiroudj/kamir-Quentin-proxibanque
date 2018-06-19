<%@include file="header1.jsp"%>
<div class="container">

	<div class="container-fluid">

		<div class="widget-header">
			<h3>Liste des clients</h3>
		</div>
		<a href="<c:url value="/listClient" />"><input type="button"
			value="lister les clients"></a>
		<div></div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">Numéro</th>
					<th scope="col">Nom</th>
					<th scope="col">Prénom</th>
					<th scope="col">Adresse</th>
					<th scope="col">
						<div class="action">Actions</div> <!-- <div class="actions"><div><label>modifier</label></div><div><label >supprimer</label></div><div><label >les comptes</label></div></div> -->
					</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="client" items="${clients}">
					<tr>

<<<<<<< HEAD
						<th scope="row">${client.id}</th>
						<td>${client.nom}</td>
						<td>${client.prenom}</td>
						<td>${client.adresse}</td>
						<td>
							<nav class="navbar navbar-expand-sm navbar-light actions2">
								<div id="icones">
									<a href="<c:url value='/updateClient'/>" alt="Modifier"
										title="Modifier"><img id="CRUDIcons" title="Modifier"
										alt="Modifier" src="update-icon.png" /></a>
								</div>
								<div id="icones">
									<a href="<c:url value='/deleteClient'/>" alt="Supprimer"
										title="Supprimer"><img id="CRUDIcons" title="Supprimer"
										alt="Supprimer" src="delete-icon.png" /></a>
								</div>
								<div id="icones">
									<a href="<c:url value='/listClient'/>" alt="ListComptes"
										title="ListComptes"><img id="CRUDIcons"
										title="ListComptes" alt="ListComptes" src="list-icon.png" /></a>
								</div>
							</nav> <%--   	 <div class="actions">
	       <div><a href="<c:url value="/updateClient" />">modifier</a></div>
=======
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
	       <div><a href="<c:url value="/updateClient?idClient=${client.id}" />">modifier</a></div>
>>>>>>> 9b3b4701ed8abfcca747d39fd3bf748d91706a70
	       <div><a href="<c:url value="/deleteClient" />">supprimer</a></div>
	       <div><a href="<c:url value="/listClient" />">listeComptes</a></div>
	   </div> --%>
						</td>

					</tr>

				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>