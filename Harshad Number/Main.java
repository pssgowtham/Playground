#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0;

  cin>>n;
  int s=n;
  while(n>0)
  {
    m=n%10;
    sum=sum+m;
    n=n/10;
  }

  if(s%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}