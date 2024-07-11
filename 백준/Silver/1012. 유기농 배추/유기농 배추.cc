#include <bits/stdc++.h>
#define endl '\n';

using namespace std;

int graph[51][51]={0};
int xx[4] = {0,0,-1,1};
int yy[4] = {1,-1,0,0};
int t,m,n,k;
int a,b;
int ans;

void dfs(int x,int y){
    for(int i=0;i<4;i++){
        int X = x + xx[i];
        int Y = y + yy[i];

        if(X>=0 && X<n && Y>=0 && Y<m && graph[X][Y]==1){
            graph[X][Y] = 0;
            dfs(X,Y);
        }
    }
    return;
}


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> t;

    while(t--){
        ans = 0;
        cin >> m >> n >> k;

        for(int i=0;i<n;i++){
            memset(graph[i],0,m*sizeof(int));
        }

        while(k--){
            cin >> a >> b;
            graph[b][a] = 1;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(graph[i][j]==1){
                    dfs(i,j);
                    ans++;
                }
            }
        }
        cout << ans << endl;
    }
    return 0;
}
