// write a program to calcualte length of string using function
#include<stdio.h>
int length(char *);
int main()
{
    char str[50]="Rushikesh";
    printf("Length of given string is %d",length(str));
    return 0;
}
int length(char *s)
{
    int cnt=0;
    while(*s!='\0')
    {
        cnt++;
        s++;
    }
    return cnt;
}