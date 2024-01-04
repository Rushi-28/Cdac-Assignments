/*2. In Already created Stack class use
1. stack overflow
2. Stack Underflow exception classes.*/
// Stack datastructure using template
#include<iostream>
using namespace std;
template<class T>

class cStack
{
    int top,size;
    T *arr;
    public :
    cStack()
    {
    size=5;
    top=-1;
    arr=new T[size];
}
cStack(int size)
{
    this->size=size;
    top=-1;
    arr=new T [this->size];
}
void display()
{
    for(int i=size;i>=0;i--)
    cout<<endl<<arr[i];
}
void Push(T m)
{
    if(top>size-1)
    cout<<"stack is full";
    else 
    {
        top++;
        arr[top]=m;
    }
}
T Pop()
{
    if(top<0)
    cout<<"Stack is empty";
    else 
    {
        T temp=arr[top];
        top--;
        return temp;
    }
    return 0;
}
    
};

int main()
{
    cStack<int> c1;
    int ch,no;
    do
    {
        cout<<"\nEnter choise\n1. Push\n2. Pop\n3. Display\n0.exit";
        cin>>ch;
        switch (ch)
        {
        case 1:
            cout<<"enter no to be pushed: ";
            cin>>no;
            c1.Push(no);
            break;

        case 2:
            
            cout<<endl<<"Deleted Element: "<<c1.Pop();
            break;
        case 3:
            c1.display();

        }
    } while (ch==0);
    
    
    
    return 0;
}