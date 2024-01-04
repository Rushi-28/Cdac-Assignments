#include<stdio.h>
int main()
{
	int num,i=0,sum=0,fun;
	printf("Please Enter Number:- ");
	scanf("%d",&num);

	while( num!=0)
	{
		fun=num%10;
		num=num/10;
		sum=sum+fun;
		i++;
	}
	printf("Total Number Of Digits In Given Number Are %d And There Sum Is %d",i,sum);
return o;

}