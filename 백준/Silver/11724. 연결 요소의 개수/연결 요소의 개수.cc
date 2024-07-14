#include <bits/stdc++.h>
#define endl '\n';
#define ll long long
using namespace std;

vector<int>graph[1001];
bool visited[1001];

void dfs(int x){
    visited[x] = true;
    for(int i = 0; i < graph[x].size(); i++){
        int y = graph[x][i];
        if(!visited[y]){
            dfs(y);
        }
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n,m;
    cin >> n >> m;
    while(m--){
        int a,b;
        cin >> a >> b;
        graph[a].push_back(b);
        graph[b].push_back(a);
    }

    int cnt = 0;
    for(int i=1;i<=n;i++){
        if(!visited[i]){
            cnt++;
            dfs(i);
        }
    }

    cout << cnt << endl;
    return 0;
}