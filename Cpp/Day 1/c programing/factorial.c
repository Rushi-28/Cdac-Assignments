#include<stdio.h>
int main()
{
 	int i, fact, num;
	printf("Please enter Any Number:- ");
	scanf("%d",&num);

	for(i=1,fact=1;i<=num;i++)
	(fact=fact*i);

	printf("Factorial of number %d is %d",num,fact);
return 0;
}