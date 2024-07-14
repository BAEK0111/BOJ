#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 101

int n, m;

bool visited[MAX][MAX];
int graph[MAX][MAX];
int dist[MAX][MAX];

int dx[] = {-1, 1, 0, 0};
int dy[] = {0, 0, -1, 1};

bool is_inside(int x, int y) {
    return (0 <= x && x < n && 0 <= y && y < m);
}

queue<pair<int, int>> q;

void bfs(int x, int y) {
    visited[x][y] = true;
    q.push({x, y});
    dist[x][y]++;

    while (!q.empty()) {
        int cx = q.front().first;
        int cy = q.front().second;

        q.pop();

        for (int k = 0; k < 4; k++) {
            int nx = cx + dx[k];
            int ny = cy + dy[k];

            if (is_inside(nx, ny)) {
                if (!visited[nx][ny] && graph[nx][ny] == 1) {
                    visited[nx][ny] = 1;
                    q.push({nx, ny});
                    dist[nx][ny] = dist[cx][cy] + 1;
                }
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n >> m;

    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        for (int j = 0; j < m; j++) {
            graph[i][j] = s[j] - '0';
        }
    }

    bfs(0, 0);

    cout << dist[n - 1][m - 1] << endl;

    return 0;
}