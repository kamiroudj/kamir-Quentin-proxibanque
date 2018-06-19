<%@include file="header1.jsp" %>
<div class="container">
        <div class="container-fluid">
            <div class="widget-header">
                <h3>Liste des comptes</h3>
            </div id="bouttonlister">
            <a href="<c:url value='/listClient' />"><input type="button" value="lister les clients"></a>
            <table class="table table-bordered">
                <thead>
                    <tr>
                    <th scope="col">Client</th>
                    <th scope="col">Compte1</th>
                    <th scope="col">Compte2</th>                        
                    <th scope="col">
                        <div class="action">Actions</div>
                        <!-- <div class="actions"><div><label>CréerCompte</label></div><div><label >supprimer</label></div><div><label >Effectuer virement</label></div></div> -->
                    </th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="client" items="${clients}">
                    <tr>

                        <th scope="row">${client.id}</th>
<!--     Ajouter les requetes Client.comte1 et Client.compte2  
                     <td>${client.compte1}</td>
                        <td>${client.compte2}</td>
                        <td>  --> 
                            <nav class="navbar navbar-expand-sm navbar-light actions2">
                                <div id="icones"><a href="<c:url value='/createCompte'/>" alt="Modifier" title="Modifier"><img id="CRUDIcons"  title="Modifier" alt="Modifier" src="update-icon.png" /></a></div>
                                <div id="icones"><a href="<c:url value='/deleteCompte'/>" alt="Supprimer" title="Supprimer"><img id="CRUDIcons" title="Supprimer" alt="Supprimer" src="delete-icon.png" /></a></div>
                                <!-- <div id="icones"><a href="<c:url value='/listClient'/>" alt="ListComptes" title="ListComptes"><img id="CRUDIcons" title="ListComptes" alt="ListComptes" src="list-icon.png" /></a></div> -->
                            </nav>
                            <!-- <div class="floating">
                                <div><a href="<c:url value='/updateClient'/>">modifier</a></div>
                                <div><a href="<c:url value='/deleteClient' />">supprimer</a></div>
                                <div><a href="<c:url value='/listClient' />">listeComptes</a></div>
                            </div> -->
                        </td>
                    
                    </tr>
                        
                    </c:forEach>
                </tbody>
        </div>
    </div>
</body>
</html>