#include<iostream>
using namespace std;
int main(){
  int n,m=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    m=i*m;
  }
  cout<<m;
}