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
/*cStack::cStack()
{
    size=5;
    top=-1;
    arr=new T[size];
}
cStack::cStack(int size)
{
    this->size=size;
    top=-1;
    arr=new T [this->size];
}
void cStack::display()
{
    for(int i=size;i>=0;i--)
    cout<<endl<<arr[i];
}
void cStack::Push(T m)
{
    if(top>size-1)
    cout<<"stack is full";
    else 
    {
        top++;
        arr[top]=m;
    }
}
T cStack::Pop()
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
}*/
int main()
{
    cStack<int> c1;
    // cStack c1;
    c1.Push(10);
    c1.Push(20);
    c1.display();
    c1.Push(30);
    c1.Push(40);
    c1.Push(50);
    c1.Push(60);
    c1.Push(70);
    c1.display();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
     cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    cout<<endl<<"Deleted Element: "<<c1.Pop();
    return 0;
}