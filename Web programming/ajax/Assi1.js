var exp=require('express');
var app=exp();
app.listen(9000,function(){
    console.log("ajax 1 server 9000")
})
app.get('/form',function(req,res){
    res.sendFile(__dirname+"/Assi1.html")
})
app.get('/home',function(req,res){
    res.send("Welcome to ajax : "+req.query.nm);
})
app.all('*',function(req,res){
    res.send("wrong url please check once")
})