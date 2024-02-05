var exp=require('express');
var bd=require('body-parser');
var app=exp();

app.listen(9000,function(){
console.log("server login at----");
})

app.use(bd.urlencoded({extended:false}));

app.get('/loginform',function(req,res){
res.sendFile(__dirname+"/loginformpost.html");
});

app.post('/logincheck',function(req,res){

if(req.body.uid=="object" && req.body.pwd=="obj123")
res.send("login successful"+"\n<h1>welcome "+req.body.uid+"</h1>");
else 
res.redirect('/loginform');
});
