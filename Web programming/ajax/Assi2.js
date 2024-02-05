var exp=require('express')
var mys=require('mysql2')

var app=exp();
var conn=mys.createConnection({
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

app.listen(9000,function()
{
    console.log("Ajax jquery server")
})

app.use(exp.static('resources'));

app.get('/loginpage',function(req,res){
    res.sendFile(__dirname+"/Assi2.html")
})

app.get('/createtbl',function(req,res){
    var query="select * from emp where EMPNO="+req.query.eid;
    conn.query(query,function(err,data){
        if(!err)
        {
            res.write("<table border=1>")
            data.forEach(function(v){
                res.write("<tr>");
                res.write("<td>Employee name: "+v.ENAME+"</td>");
                res.write("</tr>");
                res.write("<tr>");  
                res.write("<td>Job: "+v.JOB+"</td>");
                res.write("</tr>");
                res.write("<tr>");  
                res.write("<td>Salary: "+v.SALL+"</td>");
                res.write("</tr>");
                res.write("<tr>");  
                res.write("<td>Commission: "+v.COMM+"</td>");
                res.write("</tr>");
                res.write("<tr>");  
                res.write("<td>Department No: "+v.DEPTNO+"</td>");
                res.write("</tr>");  
            })
            res.write("</table>")
            res.end();
        }
        
    })
})