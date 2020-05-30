#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m;
  cin>>n;
  for(int i=1;i<=n;i++)
  { if(i%2==0)
    { m=i*i-2;
     cout<<m<<" ";}
   if(i%2!=0)
    { m=i*i-1;
     cout<<m<<" ";}}
}