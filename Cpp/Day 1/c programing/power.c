#include <stdio.h>

int main() {

int index, base, res=1;

printf("Please enter Base Number :- ");
scanf("%d",&base);

printf("Please enter Index of Base Number :- ");
scanf("%d",&index);

for(i=1;i<=index;i++)
res=base*res;

printf("Power of %d to %d is %d", base, index,res);
return 0;
}
