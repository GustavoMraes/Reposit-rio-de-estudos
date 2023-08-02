const express = require("express");
const app = express();

function home(req, res){
    console.log(req.method);
    console.log(req.url);
    res.status(404);
    res.send("Home Page")    
    
}

function contato(req, res) {
    res.send("<h1>Contato<h1>");    
}

function contact(req, res) {
    res.status(301);
    res.header("Location", "/contato");
    res.send();

}


app.get("/", home);
app.get("/contato", contato);
app.get("/contact", contact);

app.listen(3001, () => console.log("Rodando 3001"));
