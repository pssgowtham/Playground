#include<iostream>
using namespace std;
int main()
{
  int n,m,x=0;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++){
    x=0;
    for(int j=0;j<m;j++){
      cin>>a[i][j];
      x+=a[i][j];
    }
    cout<<x<<endl;
  }
}