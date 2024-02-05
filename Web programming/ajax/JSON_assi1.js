var exp=require('express');
var sql=require('mysql2');
var bd=require('body-parser');

var app=exp();
var conn=sql.createConnection({
    host:"localhost",
    user:"root",
    password:"root",
    database:"knowit"
})
conn.connect(function(err)
{
    if(!err)
    console.log("database connected")
})



app.listen(9000,function(){
    console.log("json server connected");
})

app.use(exp.static('resources'));
app.use(bd.urlencoded({extended:false}))

app.get('/loginpage',function(req,res){
    res.sendFile(__dirname+"/JSON_assi1.html");
})

app.post('/getall',function(req,res){
    var dno=req.body.deptno;
    var query="Select * from emp where deptno="+dno;
    console.log(query);
    conn.query(query,function(err,result){
        if(!err)
        {
            res.send(JSON.stringify(result));
        }
    })
})

app.all('*',function(req,res){
    res.send("incorrect url");
})