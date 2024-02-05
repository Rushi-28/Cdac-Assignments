var u = require('url');
var h = require('http');
var fs = require('fs');

h.createServer(function(req,res){
	if(req.url == '/favicon.ico')
		return;
	else{
		var data = parseInt(fs.readFileSync('logcnt.txt'));
		data=data+1;
		console.log("visit count: "+data);
		res.writeHead(200, {'Content-Type': 'text/plain'});
        	res.write("visit count: " + data);
		fs.writeFileSync('logcnt.txt', data.toString());
        	res.end();	
	}
}).listen(9000,function(){
	console.log("Server Sarted at 9000");
})