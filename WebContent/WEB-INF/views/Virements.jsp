<%@include file="header1.jsp"%>

<div class="container" style="position: relative; top: 5em">

	<div class="container-fluid">
	<a href="<c:url value='/listClient' />"><input type="button" value="Retour liste clients"></a>
		<div class="virementBloc">
			<div class="widget-header">
				<h3>Effectuer un virement</h3>
			</div>
			<div class=form-group>
				<h4>Compte � d�biter :</h4>
				<select id="compteCredit" class="form-control">
					<c:forEach var=comptes items="${comptes}">
					<option>${compte.numeroCompte}</option>
					</c:forEach>
				</select>
			</div>
			<div class=form-group>
				<h4>Compte � cr�diter :</h4>
				<select id="compteDebit" class="form-control">
					<c:forEach var=comptes items="${comptes}">
					<option>${compte.numeroCompte}</option>
					</c:forEach>
				</select>						
			</div>
			<div class=form-group>
				<h4>Montant :</h4>
				<input class="form-control" type="text" placeholder="Montant � verser">
			</div>
		</div>
	</div>
</div>

</body>
</html>