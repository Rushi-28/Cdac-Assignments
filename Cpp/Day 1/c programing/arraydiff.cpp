// 5. Write a function which will return diffrence between max and min element of array.

#include<stdio.h>
int diff(int [],int);
int main()
{
    int arr[7],i,res;
     printf("Plese enter 7 Numbers :-  ");
    for(i=0;i<7;i++)
   { scanf("%d",&arr[i]);
   }
    res=diff(arr,7);
    printf("The difference of max and min elements in a given array is %d",res);

}
int diff(int a[],int size)
{
    int i, sub,max,min;
    max=a[0];
    for(i=0;i<size;i++)
    {if(a[i]>max)
    max=a[i];
    }
    min=a[0];
    for(i=0;i<size;i++)
    {if(a[i]<min)
    min=a[i];
    }
    sub=max-min;
    return sub;
}