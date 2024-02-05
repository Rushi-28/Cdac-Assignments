var ex=require('express');

var v1=ex();

v1.listen(9000,function(){
console.log("server is at 9000");
});

v1.get('/welcome',function(req,res){
 res.send("<h1>Welcome to express js</h1>");
});

v1.get('/loginform',function(req,res){
	res.sendFile(__dirname+"/loginform.html");
});

v1.get('/logincheck',function(req,res){
	if(req.query.uid=="object" && req.query.pwd=="knowit")
	res.send("<h3>Login successful</h3>");
	else
	res.send("<h3>Login failed</h3>");
});

v1.all('*',function(req,res){
	res.send("<p> Incorrect URL </p>");
})
