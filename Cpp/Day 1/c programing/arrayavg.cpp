// 4. find out average of all elements of array using function.


#include<stdio.h>
float avg(int[],int);
int main()
{
   
   int i,n;
   float res;
   printf("Enter size of array :- ");
    scanf("%d",&n);
     int arr[n];
     printf("Plese enter %d Numbers :-  ",n);
    for(i=0;i<n;i++)
   { scanf("%d",&arr[i]);
   }
    for(i=0;i<n;i++)
   { printf("%d",arr[i]);
   }
    res=avg(arr,n);
    printf("The average of all the elements in a given array is %f",res);
    return 0;

}
float avg(int a[],int size)
{
    int i,sum=0;
    float avrg;
    for(i=0;i<size;i++)
    {
        sum=sum+a[i];
    }
    avrg=(float)sum/size;
    return avrg;

}
