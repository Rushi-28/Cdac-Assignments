#include<stdio.h>
int sum(int [],int);
int main()
{
    int arr[]={52,62,87,98,67,61,51,34};
    printf("sum of all even elements in an array is : %d",sum(arr,8));
}
int sum(int a[],int size)
{
    int i,add=0;
    for(i=0;i<size;i++)
    {
        if(a[i]%2==0)
        add=add+a[i];
    }
    return add;
}