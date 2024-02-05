var ex=require('express');

var app=ex();

app.listen(9000,function(){
console.log("server connected");
});

app.use(ex.static('images'));
app.use(ex.static('stylesheet'));     			//assi3

app.get('/loginform',function(req,res){
res.sendFile(__dirname+"/Loginform.html");
});

app.get('/logincheck',function(req,res){
var user=req.query.uid;
var ps=req.query.pwd;
if(user=="object" && ps=="obj123")
{
res.send("login successfull");
}
else
res.send("login failed");
});

app.all('*',function(req,res){
res.send("check url wrong inpt");
});