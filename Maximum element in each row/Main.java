#include<bits/stdc++.h>

using namespace std;

int main()
{
  int n,m,x;
  cin>>n>>m;
  int a[n][m];
  for(int i=0;i<n;i++){
    x=INT_MIN;
    for(int j=0;j<m;j++){
      cin>>a[i][j];
      x=max(x,a[i][j]);
    }
    cout<<x<<endl;
  }
  
}