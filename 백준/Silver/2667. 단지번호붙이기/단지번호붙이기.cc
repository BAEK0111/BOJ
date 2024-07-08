#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

bool visited[26];
int graph[26][26];
int dx[4] = {1, -1, 0, 0};
int dy[4] = {0, 0, 1, -1};
int n;

int dfs(int i, int j) {
    graph[i][j] = 0;
    int cnt = 1;
    for (int k = 0; k < 4; k++) {
        int x = i + dx[k];
        int y = j + dy[k];
        if (0 <= x && x < n && 0 <= y && y < n) {
            if (graph[x][y] == 1) {
                cnt += dfs(x, y);
            }
        }
    }
    return cnt;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    string s;


    for (int i = 0; i < n; i++) {
        cin >> s;
        for (int j = 0; j < n; j++) {
            graph[i][j] = s[j] - '0';
        }
    }

    vector<int> res;
    int temp = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == 1) {
                res.push_back(dfs(i, j));
            }
        }
    }

    sort(res.begin(), res.end());

    cout << res.size() << endl;
    for (int i = 0; i < res.size(); i++) {
        cout << res[i] << endl;
    }
    
    return 0;
}