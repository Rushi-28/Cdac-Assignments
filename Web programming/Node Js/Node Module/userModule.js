exports.isprime=function(n){
var flag=true;
var i;
for(i=2;i<n;i++)
{
if(n%i==0)
{
	flag=false;
	break;
}
}
return flag;
};

exports.calfact=function(n){
var fact=1;
for(var j=n;j>0;j--)
{
	fact*=j;
}
return fact;
};

exports.isPerfect=function(n){
var sum=0;
for(var k=1;k<n;k++)
{
if(n%k==0)
sum+=k
}
if(sum==n)
return true;
else
return false;
};