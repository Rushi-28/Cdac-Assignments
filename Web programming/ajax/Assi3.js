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

app.get('/login',function(req,res){
    res.sendFile(__dirname+"/Assi3.html")
})

app.get('/lk',function(req,res){
    var query="select * from users where name='"+req.query.user+"'";
    conn.query(query,function(err,data){
        if(!err)
        {
            if(data[0]==null)
            //conn.query("insert into user(user) values("+req.query.user+")");
            res.send("Username created")
            else
            res.send("Username alredy exists")
        }
        else
        {
            res.send(err.toString());
        }
    })
})