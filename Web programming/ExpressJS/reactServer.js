var exp=require('express');
var sq=require('mysql2');
var bp=require('body-parser');
var cor=require('cors');

var ap=exp();
ap.use(bp.json());
ap.use(cor());

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
		res.send(JSON.stringify(data));
	}
});	
});

ap.post("/insertemp",function(req,res){
	var eno=req.body.empno;
	var enm=req.body.ename;
	var esal=req.body.sal;
	var edpt=req.body.deptno;
	var query="insert into emp(EMPNO,ENAME,SAL,DEPTNO) values(?,?,?,?)";
	conn.query(query,[eno,enm,esal,edpt],function(err){
		if(!err)
		res.send("Employee inserted Successfully");
		else
		res.send("Employee insertion Failed");
	})
})

ap.all('*',function(req,res){
	res.send("Wrong url....")
})