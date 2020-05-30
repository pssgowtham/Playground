#include<bits/stdc++.h>
using namespace std;

struct student{
	string s;
	string s1;
  	int y;
  	float f;
};

bool baka(student a,student b){
	return a.s<b.s;
}
int main()
{
  int n;
  cout<<"Enter the number of students"<<endl;
  cin>>n;
  struct student a[n];
  for(int i=0;i<n;i++){
  	cout<<"Enter the details of student "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>a[i].s;
    cout<<"Enter department"<<endl;
    cin>>a[i].s1;
    cout<<"Enter year of study"<<endl;
    cin>>a[i].y;
    cout<<"Enter cgpa"<<endl;
    cin>>a[i].f;
  }
  sort(a,a+n,baka);
  cout<<"Details of students"<<endl;
  for(int i=0;i<n;i++){
  	cout<<"Student "<<i+1<<endl;
    cout<<"Name:"<<a[i].s<<endl<<"Department:"<<a[i].s1<<endl;
 	cout<<"Year of study:"<<a[i].y<<endl;
    cout<<"CGPA:"<<a[i].f<<endl;
  }
  
}