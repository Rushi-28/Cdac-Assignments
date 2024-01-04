#include<stdio.h>
int main()
{	char ch;
	printf("Enter any Alphabate :- ");
	scanf("%c",&ch);

	if(ch>=65 && ch<=90)
	printf("Opposite Case is %c",ch+32);

	else if(ch>=97 && ch<=122)
	printf("Opposite Case is %c",ch-32);

	else 
	printf("Please enter valid Alphabate");
	
return 0;

}

 //1.Accpet number from user and Count number of digits using function.
// 2. Accept number from user and print it's multiplication table using function.
// 3. Find out max element from array using function.
// 4. find out average of all elements of array using function.
// 5. Write a function which will return diffrence between max and min element of array.