/*1. Implement Following options in file
  1. Add records
  2. Dipslay Records
  3. Search specific record;
  4. Count number of records.
  5. Modify records
*/
#include<iostream>
#include<fstream>
#include<string.h>
using namespace std;
class Student
{
    static int cnt;
    int rno;
    char name[20];
    float per;
    public:
    Student();
    Student(const char *,float);
    void accept();
    void display();
    void addrecord();
    void displayrecords();
    bool search(int);
    bool modify(int);
    int countrecord();

};
    Student::Student()
    {
        cnt++;
        rno=cnt;
        strcpy(name,"NA");
        per=0.0;
    }
    Student::Student(const char *ch,float m)
    {
         cnt++;
        rno=cnt;
        strcpy(name,ch);
        per=0.0;
    }
    void Student::accept()
    {
        char nm[20];
        float pr;
        cout<<"Enter name ande persentage: ";
        cin>>nm>>pr;
        cnt++;
        rno=cnt;
        strcpy(this->name,nm);
        per=pr;
    }
    void Student::display()
    {
        cout<<endl<<"Student Rollno: "<<rno;
        cout<<endl<<"Student Name: "<<name;
        cout<<"Student Percentage: "<<per;

    }
    void Student::addrecord()
    {
        ofstream fout("student.dat",ios::app|ios::binary);
        Student s1;
        s1.accept();
        fout.write((char *)&s1,sizeof(s1));
        fout.close();
    }
    void Student::displayrecords()
    {
        Student s1;
        ifstream fin("student.dat",ios::binary);
        while(fin.read((char *)&s1,sizeof(Student)))
        s1.display();
        fin.close();
    }
    bool Student::search(int rno)
    {
        bool res=false;
        Student s1;
        ifstream fin("student.dat",ios::binary);
        while(fin.read((char *)&s1,sizeof(Student)))
        {
            if(s1.rno==rno)
            {
                s1.display();
                res=true;
            }
        }
        fin.close();
        return res;
    }
    bool Student::modify(int rno)
    {
        bool res=false;
        Student s1,s2;
        fstream f1("student.dat",ios::binary|ios::in|ios::out);
        while(f1.read((char *)&s1,sizeof(Student)))
        {
            if(s1.rno==rno)
            {
                s2.accept();
                long size=((-1) * sizeof(Student));
                f1.seekp(size,ios::cur);
                f1.write((char *)&s2,sizeof(Student));

                res=true;
            }
        }
        f1.close();
        return res;
    }
    int Student::countrecord()
    {
        ifstream fin("student.dat",ios::binary);
        int cnt=0;
        fin.seekg(0,ios::end);
        int no=fin.tellg();
        cnt=no/(sizeof(Student));
        return cnt;
    }
    int Student::cnt;
int main()
{
    int ch,i;
    Student s1;
    do
    {
    cout<<endl<<"1. Add records\
  \n2. Dipslay Records\
  \n3. Search specific record.\
  \n4. Count number of records.\
  \n5. Modify records\
  \n0. Exit\
  \nEnter Your Choise: ";
  cin>>ch;
        switch (ch)
        {
        case 1:
        s1.addrecord();   
            break;

        case 2:
        s1.displayrecords();
        break;

        case 3:
        cout<<"Enter Roll no to be search: ";
        cin>>i;
        if(s1.search(i)==false)
        cout<<"Student not found.";
        break;

        case 4:
        cout<<"Total no of Students : "<<s1.countrecord();
        break;

        case 5:
        cout<<"Enter Roll no to be Modify: ";
        cin>>i;
        if(s1.search(i)==false)
        cout<<"Student not found.Cannot modify record.";
        break;
        
        }
    } while (ch!=0);
    
  


    return 0;
}