// write a menu driven program for
// 1.Count number of characters
// 2.Count number of spaces
// 3.Count number of vowels

#include<stdio.h>
#include<string.h>
void menu(int );
int main()
{   
    int ch;
    
    printf("Enter choise what you want to find : ");
    printf("\n 1.Count number of character \n 2.Count number of spaces \n 3.Count number of vowels\n");
    scanf("%d",&ch);
    menu(ch);
    return 0;
}
void menu(int p)
{int vow=0,sp=0,cnt=0,z;
    char str[50]={"My name is Rushikesh Jagdish Nikam"};
    char a,e,i,o,u,A,E,I,O,U;
    
    switch (p)
    {
    case 1:
            for(z=0;str[z]!='\0';z++)
            {
                cnt++;
            }
        printf("Total Number of Characters in given string are :- %d",cnt);
        break;
    case 2: 
            for(z=0;str[z]!='\0';z++)
            { 
                if(str[z]==' ')
                
                sp++;
                
            }
        printf("Total Number of spaces in given string are :- %d",sp);
   
        break;
    case 3:
            for(z=0;str[z]!='\0';z++)
            {
                if(str[z]=='a' || str[z]=='A' ||str[z]=='e' || str[z]=='E' || str[z]=='i' || str[z]=='I' || str[z]=='o' || str[z]=='O' || str[z]=='u' || str[z]=='U')
                {printf("Right");
                vow++;
                }
            }
        printf("Total Number of vowels in given string are :- %d",vow);
   
        break;
    default:
            if(p!=1 || p!=2 || p!=3)
        printf("Invalid Choise ")    ; 
        break;
    }
}