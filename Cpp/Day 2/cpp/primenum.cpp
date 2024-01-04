// write a program to check whether number is prime or not

#include<iostream>
using namespace std;
 int main()
{
	int num,i;
	cout<<"Please Enter Number:- ";
	cin>>num;

	for(i=2;i<num;i++)
	{
		if (num%i==0)
		{
			cout<<"Given Number is not prime";
		break;
		}	
	}
	if(i==num)
	cout<<"Given Number is Prime";

return 0;
		
}