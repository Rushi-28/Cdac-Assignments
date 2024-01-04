// Accept array size form user and perform funtion
#include<iostream>
using namespace std;
void accept(int [],int);
void display(int[],int);
void findmaxmin(int[],int,int&,int&);
int search(int[],int,int);
void evenodd(int[],int,int&,int&);
int main()
{
    int *p,no,i,max,min,key,flag=0,even,odd;
    cout<<"Please enter array size: ";
    cin>>no;
    p=new int[no];
    accept(p,no);
    display(p,no);
    findmaxmin(p,no,max,min);
    cout<<"Please enter no to be searched in Array: ";
    cin>>key;
    flag=search(p,no,key);
    if(flag==key)
    cout<<"Number is found in array";
    else
    cout<<"Number is not found in array";
    evenodd(p,no,even,odd);
    cout<<"\nTotal Even nos are: "<<even<<"\nTotal Odd nos are: "<<odd;
    cout<<"\nmaximum no: "<<max<<"\nMinimum no: "<<min;

    return 0;
}
void accept(int q[],int size)
{
    int i;
    cout<<"Please enter no ";
     for(i=0;i<size;i++)
    {
        cin>>q[i];
    }
}
void display(int r[],int size)
{
    int i;
     for(i=0;i<size;i++)
    {
     cout<<"\t"<<r[i];
    }
}
void findmaxmin(int z[],int size,int &x,int &y)
{
    int i;
    x=z[0],y=z[0];
    for(i=0;i<size;i++)
    {
        if(z[i]>x)
        x=z[i];
    }
     for(i=0;i<size;i++)
    {
        if(z[i]<y)
        y=z[i];
    }
}
int search(int a[],int size,int k)
{
    int i,j=0;
    for(i=0;i<size;i++)
    {
        if(a[i]==k)
        return a[i];
        
    }
        return 0;
}
void evenodd(int a[],int size,int&b,int&c)
{
    int i;
    b=0,c=0;
    for(i=0;i<size;i++)
     {
        if(a[i]%2==0)
        b++;
        else
        c++;
     }
}