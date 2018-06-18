<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="PBv2.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
    <title>Document</title>
</head>
<body style="background-color: gray">
    <div id=bg1 style="background-color: darkgray"><img src="C:\Users\Quentin\Projets JAVA\ProxiBv2\black-and-white-city-houses-skyline.jpg" id="bg1" class="img-fond" alt="image de fond"></div>
    <div class=header>
        <nav class="navbar navbar-expand-lg navbar-light bg-dark">
            <h1 style="color: white">ProxiBanque</h1>                                  
        </nav>
    </div>
    <div class=content>
        <div class="presentation">
            <h2>Présentation :</h2>
            <p>
                Duis sollicitudin sem vehicula nisi laoreet, sed viverra urna suscipit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Etiam in gravida eros. Fusce ultricies mattis leo at imperdiet. Nam non ante sit amet odio egestas aliquet. Donec viverra finibus velit rutrum pellentesque. Mauris dui urna, auctor quis tincidunt vitae, gravida vel lectus. Fusce faucibus, felis nec ullamcorper viverra, ipsum nulla consequat nunc, ut tempus tellus risus nec ligula. Sed convallis condimentum lacus, aliquam sollicitudin felis egestas in. Sed sit amet efficitur est. Ut lobortis auctor mauris, in aliquam ante rhoncus in. Praesent id porta turpis, non mattis erat. Pellentesque at justo mauris.
            </p>
        </div>        
        <form id="authentification">
            <span><h3>Authentification :</h3></span>
            <div class="form-group">
                <label for="InputEmail1">User Id</label>
                <input type="userId" class="form-control" id="InputId" placeholder="Enter User Id">
            </div>
            <div class="form-group">
                <label for="InputPassword">Password</label>
                <input type="password" class="form-control" id="InputPassword" placeholder="Password">
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="Radio" id="Radio1" value="option1" >
                <label class="form-check-label" for="Radio1">
                    Conseiller Clientèle
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="Radio" id="Radio2" value="option1" >
                <label class="form-check-label" for="Radio2">
                    Gérant
                </label>
                </div>
            <button class="valForm">Valider</button>
        </form>

    </div>
    <div class=footer>
        <h6>&copy; GTM-ingénierie Projects -- Contact : ProxiBanque.elsisiussu@gmail.com</h6>
    </div>

</body>
</html>