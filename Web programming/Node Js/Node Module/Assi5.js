var ur=require('url');
var hp=require('http');

hp.createServer(function(req,res){
	var urp=ur.parse(req.url,true);
	var nm=urp.query.name;
	var cl=urp.query.color;
	res.writeHead(200,{"content-type":'text/html'});
	res.write(`<h1 style='color:${cl}'>Welcome ${nm}</h1>`);
	res.end();
}).listen(9000,function(){
console.log("sever 9000");
});