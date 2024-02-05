var n1=require('./thirdmod.js');

var arr1=[2,3,8,10,11,13,15];
var arr2=n1.isprime(arr1);
console.log(arr2);


var str=["rushi","dhiraj","prathamesh","aditya"];
var maxstr=n1.longstr(str);
console.log("Longest string: "+maxstr);

var mon=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"];
var dt=new Date();
console.log(dt.getDay()+" "+mon[dt.getMonth()]+" "+dt.getFullYear()+" "+dt.getHours()+":"+dt.getMinutes()+":"+dt.getSeconds());