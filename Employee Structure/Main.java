#include<bits/stdc++.h>
using namespace std;

struct student{
	string name;
	string des;
  	int id,age;
  	float sal;
};

int main()
{
  struct student a;
    cout<<"Enter name:"<<endl;
    cin>>a.name;
    cout<<"Enter ID:"<<endl;
    cin>>a.id;
    cout<<"Enter age:"<<endl;
    cin>>a.age;
    cout<<"Enter designation:"<<endl;
    cin>>a.des;
    cout<<"Enter Salary:"<<endl;
    cin>>a.sal;
  cout<<"Employee Details"<<endl;
  	cout<<"Name of the Employee : "<<a.name<<endl;
    cout<<"ID of the Employee : "<<a.id<<endl<<"Age of the Employee : "<<a.age<<endl;
 	cout<<"Designation of the Employee : "<<a.des<<endl;
  	cout<<"Salary of the Employee : "<<a.sal;
  
}