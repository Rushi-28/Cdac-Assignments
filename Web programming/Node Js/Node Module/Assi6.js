var f1=require('fs');

f1.readFile("Emailid.txt",function(err,data){
if(!err)
console.log(data.toString());
else
console.log("File not exists");
});
console.log("Reading complete");