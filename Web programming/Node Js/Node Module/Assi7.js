var f1=require('fs');
var h1=require('http');
var u1=require('url');

h1.createServer(function(req,res){
	var u=u1.parse(req.url,true)
	var vi=u.pathname
	if(req.url=="/favicon.ico")
	return;
	var fil;
		f1.readFile("logcnt.txt",function(err,data){
		if(!err){
		fil=parseInt(data.toString()) || 0;
		fil++;
		f1.write("logcnt.txt",fil+"",function (err){
                console.log("visit counnt updated");})			
		}
		else{
		console.log("File not exists");
		fs.writeFileSync("logcnt.txt", "0");
           	 fil = 0;}	
		});
	
	res.writeHead(200,{"content-type":'text/html'});
	res.write("VISIT COUNT: "+fil);
	res.end();
}).listen(9000,function(){
console.log("server active 9000");
});

