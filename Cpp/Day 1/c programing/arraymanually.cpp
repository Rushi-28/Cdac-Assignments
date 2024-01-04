#include<stdio.h>
int main()
{
int n;
    printf("enter no to be ");
    scanf("%d",&n);
   int arr[n],i;
     printf("Plese enter %d Numbers :-  ",n);
    for(i=0;i<n;i++)
   { scanf("%d",&arr[i]);
   }
    for(i=0;i<n;i++)
   { printf("%d",arr[i]);
   }
}