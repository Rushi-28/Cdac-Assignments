/************* Exception Handling ***********
1. Accept two  numbers from user and print addtion,subtraction,multiplication,division.
   user exception handling for divid by zero. */
   #include<iostream>
   using namespace std;
   int main()
   {
        int a,b,res;
        cout<<endl<<"Enter 2 number: ";
        cin>>a>>b;
        res=a+b;
        cout<<endl<<"Addition is: "<<res;
        res=a-b;
        cout<<endl<<"Substraction is: "<<res;
        res=a*b;
        cout<<endl<<"Multiplication is: "<<res;
       try{ 
       if(b==0)
       throw 100;
       res=a/b;
       cout<<endl<<"Division is: "<<res;}
       catch(int a)
       {
        cout<<endl<<"cannot divide by 0";
       }
       try{ 
       if(b==0)
       throw 100;
       res=a%b;
       cout<<endl<<"Division is: "<<res;}
       catch(int a)
       {
        cout<<endl<<"cannot divide by 0";
       }  
        

    return 0;
   }