#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 1001

int n, m;
bool visited[MAX][MAX];
int graph[MAX][MAX];

bool is_inside(int x, int y) {
    return (0 <= x && x < m && 0 <= y && y < n);
}

int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};

int dfs(int x, int y) {
    visited[x][y] = true;
//    cout << "x : " << x << " y : " << y << endl;
    if (x == m - 1)
        return 1;

    for (int k = 0; k < 4; k++) {
        int nx = x + dx[k];
        int ny = y + dy[k];

        if (is_inside(nx, ny)) {
            if (!visited[nx][ny] && graph[nx][ny] == 0) {
                if (dfs(nx, ny)) return 1;
            }
        }
    }
    return 0;
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m >> n;
    for (int i = 0; i < m; i++) {
        string s;
        cin >> s;
        for (int j = 0; j < n; j++) {
            graph[i][j] = s[j] - '0';
        }
    }

    for (int i = 0; i < n; i++) {

        memset(visited, 0, sizeof(visited));

        if (graph[0][i] == 0) {
            if (dfs(0, i) == 1) {
                cout << "YES" << endl;
                return 0;
            }
        }
    }
    cout << "NO" << endl;

    return 0;
}