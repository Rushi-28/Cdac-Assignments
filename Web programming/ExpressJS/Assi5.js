var exp=require('express');
var sq=require('mysql2');

var ap=exp();
var conn=sq.createConnection({
host:"localhost",
user:"root",
password:"root",
database:"knowit"
});
conn.connect(function(err){
if(!err)
console.log("database connected successfully");
});

ap.listen(9000,function(){
console.log("server at 9000");
});


ap.get("/emps",function(req,res){
conn.query("select * from emp",function(err,data){
	if(!err)
	{
		res.write("<table border=1>");
		data.forEach(function(v){
		res.write("<tr>");
		res.write("<td>"+v.EMPNO);
		res.write("</td>");
		res.write("<td>"+v.ENAME);
		res.write("</td>");
		res.write("<td>"+v.JOB);
		res.write("</td>");
		res.write("</tr>");
		})
		res.write("</table>");
		res.end();
	}
});	
});