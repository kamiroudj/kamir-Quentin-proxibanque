<%@ include file="header1.jsp"%>

<div class="container">
	<div class="container-fluid">
		<div class="widget-header">
			<h3>Liste des comptes</h3>
		</div>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th scope="col">Numéro du compte</th>
					<th scope="col">type Compte</th>
					<th scope="col">solde</th>
					<th scope="col">decouvert</th>
					<th scope="col">taux</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="compte" items="${comptes}">
					<tr>

						<th scope="row">${compte.numero}</th>
						<td>${compte}</td>
						<td>${compte.solde}</td>
						<td>${compte.decouvert}</td>
						<td>${compte.taux}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
</body>
</html>