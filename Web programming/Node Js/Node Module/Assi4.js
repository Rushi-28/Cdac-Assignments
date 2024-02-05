var hh=require('http');

var server=hh.createServer(function(req,res){
 res.writeHead(200,{'content-type':'text/html'});
 res.write("<h1>Hello world</h1>");
 res.write("<p>Dhiraj weds Vaishii</p>");
 res.end();
});

server.listen(9000,function(){
	console.log("Server is at port no 9000"); 
});