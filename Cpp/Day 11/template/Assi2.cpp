// template function for searching element in array
#include<iostream>
using namespace std;
template<class T>
int Search(T a[],int size, T key)
{
    int flag=0,i;
    for(i=0;i<=size;i++)
    {
        if(a[i]==key)
        flag=1;
        break;
    }
    return flag;
}
int main()
{
    int size,i,res;
    cout<<"Enter size of array: ";
    cin>>size;

    int *arr;
    int key;
    arr=new int[size];
    cout<<"Enter "<<size<<" elements: ";
    for(i=0;i<size;i++)
    cin>>arr[i];

    cout<<"Enter element to be searched: ";
    cin>>key;

    res=Search(arr,size,key);
    if(res==1)
    cout<<"found";
    else 
    cout<<"not Found";

    char *arr;
    char key;
    arr=new char[size];
    cout<<"Enter "<<size<<" elements: ";
    for(i=0;i<size;i++)
    cin>>arr[i];

    cout<<"Enter element to be searched: ";
    cin>>key;

    res=Search(arr,size,key);
    if(res==1)
    cout<<"found";
    else 
    cout<<"not Found";
    return 0;
}