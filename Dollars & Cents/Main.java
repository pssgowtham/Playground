#include<iostream>
using namespace std;
int main()
{
  int n1,m1,n2,m2,n,m;
  cin>>n1>>m1>>n2>>m2;
  if(m1+m2>100)
  {
    n=n1+n2+1;
    m=m1+m2-100;
  }
  else
  {
  n=n1+n2;
  m=m1+m2;
  }
  cout<<n<<"\n"<<m;
}