exports.isprime=function(n){
var flag=true;
var i,k=0;
var arr=[];
for(let j=0;j<n.length;j++)
{
flag=true;
	for(i=2;i<n[j];i++)
	{
	if(n[j]%i==0)
	{
		flag=false;
		break;
	}
	}
if(flag)
arr[k++]=n[j];
}
return arr;
};


exports.longstr=function(strr){
var s1=strr.reduce(function(s,v){
return s.length>v.length?s:v;
})
return s1;};