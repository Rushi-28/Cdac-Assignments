/*Declare variable with built in data type like(int,char,float,char[]).
   Declare class and check it's data type at runtime.
   a.use typeid operator and check data type of all variable at runtime.
   b.In same cpp file write note on typeinfo class typeid operator.*/
   #include<iostream>
   #include<typeinfo>
   using namespace std;
   class t
   {

   };
   int main()
   {
    int x;
    char ch;
    float p;
    char a[20];
    t t1;
    cout<<endl<<"Type of x: "<<typeid(x).name();        //o/p=int
    cout<<endl<<"Type of ch: "<<typeid(ch).name();      //o/p=char
    cout<<endl<<"Type of p: "<<typeid(p).name();        //o/p=float
    cout<<endl<<"Type of a: "<<typeid(a).name();        //o/p=char[20]
    cout<<endl<<"Type of t1: "<<typeid(t1).name();      //o/p=class t
    cout<<endl<<"Size of t1: "<<sizeof(t1);             //o/p=1
    return 0;
   }