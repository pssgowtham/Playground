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
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  struct student a[n];
  for(int i=0;i<n;i++){
  	cout<<"Enter the details of college "<<i+1<<endl;
    cout<<"Enter name"<<endl;
    cin>>a[i].s;
    cout<<"Enter city"<<endl;
    cin>>a[i].s1;
    cout<<"Enter year of establishment"<<endl;
    cin>>a[i].y;
    cout<<"Enter pass percentage"<<endl;
    cin>>a[i].f;
  }
  sort(a,a+n,baka);
  cout<<"Details of colleges"<<endl;
  for(int i=0;i<n;i++){
  	cout<<"College:"<<i+1<<endl;
    cout<<"Name:"<<a[i].s<<endl<<"City:"<<a[i].s1<<endl;
 	cout<<"Year of establishment:"<<a[i].y<<endl;
    cout<<"Pass percentage:"<<a[i].f<<endl;
  }
  
}