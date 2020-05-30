#include<iostream>
using namespace std;
int main()
{
  int n,m,sum=0,s=0;
  cin>>n;
  while(n>0)
  {
   m=n%10;
    if(m%2==0)
      sum=sum+m;
    else
      s=s+m;
    n=n/10;
  }
  if(sum==s)
    cout<<"Yes";
  else
    cout<<"No";
     
}