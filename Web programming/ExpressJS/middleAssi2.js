var exp=require('express')
var fs=require('fs')
var app=exp();

app.listen(9000,function(){
console.log("server con at 9000");
});

app.use(function(req,res){
var str="Request received for: "+req+" at "+new Date();
fs.appendFile("logfile.txt",str,function(err){
if(!err)
console.log("log enter");
});
});

app.get(function(req,res){
res.sendFile(__dirname+"/logfile.txt");
});