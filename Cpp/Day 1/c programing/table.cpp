// Accept number from user and print it's multiplication table using function.
#include<stdio.h>
void table(int num);
int main()
{
    int no;
    printf("Please enter any Number to get his multiplication table :-  ");
    scanf("%d",&no);
    table(no);
return 0;

}
void table(int n)
{
    int i;
    for(i=1;i<=10;i++)
    printf("\n%d * %d = %d",n,i,i*n);

}
