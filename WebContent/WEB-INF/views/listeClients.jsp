<%@include file="header1.jsp"%>


<div class="container"style=position:relative;top:5em>

	<div class="container-fluid">

		            <div class="widget-header">
               			 <h3>Liste des clients</h3>
            		</div>
		<table class="table table-bordered">

			<thead>
				<tr>
					<th scope="col">Num�ro</th>
					<th scope="col">Nom</th>
					<th scope="col">Pr�nom</th>
					<th scope="col">Adresse</th>
					<th scope="col">
						<div class="action">Actions</div> <!-- <div class="actions"><div><label>modifier</label></div><div><label >supprimer</label></div><div><label >les comptes</label></div></div> -->
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
							<nav class="navbar navbar-expand-sm navbar-light actions2">
								<div id="icones">
									<a href="<c:url value="/updateClient?idClient=${client.id}" />"
										alt="Modifier" title="Modifier"><img id="CRUDIcons"
										title="Modifier" alt="Modifier" src="images/update-icon.png"
										style="width: 24px" style=height:24px /></a>
								</div>
								<div id="icones">
									<a href="<c:url value='/deleteClient'/>" 
										title="Supprimer"><img id="CRUDIcons" title="Supprimer"
										alt="Supprimer" src="images/delete-icon.png"
										style="width: 24px" style=height:24px /></a>
								</div>
								<div id="icones">
									<a href="<c:url value="/comptes?idClient=${client.id}" />"  
										title="ListComptes"><img id="CRUDIcons"
										title="ListComptes" alt="ListComptes"
										src="images/list-icon.png" style="width: 24px"
										style=height:24px /></a>
								</div>
							</nav>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</div>
</body>
</html>