#include <bits/stdc++.h>
#define endl '\n';
#define ll long long
using namespace std;

vector<int>graph[101];
bool check[101];
int cnt = 0;

void dfs(int x){
    check[x] = true;
    for(int i=0;i<graph[x].size();i++){
        int y = graph[x][i];
        if(!check[y]){
            dfs(y);
            cnt++;
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

    dfs(1);
    cout << cnt << endl;
    return 0;
}