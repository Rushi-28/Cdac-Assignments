//1.Accpet number from user and Count number of digits using function.

#include<stdio.h>
int digitCount(int);
int main()
{
    int num,res;
    printf("Please enter any number :- ");
    scanf("%d",&num);
    res=digitCount(num);
    printf("\n\nTotal number of digits in a given number : %d are : %d",num,res);
}

int digitCount(int num)
{
    int mod,cnt=0;
    while(num!=0)
    {
        mod=num%10;
        num=num/10;
        cnt++;
    }
     
return cnt;
}