#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 101

int n;

char graph[MAX][MAX];
bool visited[MAX][MAX];

int dx[] = {0, 1, 0, -1};
int dy[] = {1, 0, -1, 0};

bool is_inside(int x, int y) {
    return (0 <= x && x < n && 0 <= y && y < n);
}

void dfs(int x, int y) {
    visited[x][y] = true;
//    cout << x << " " << y << endl;

    for (int k = 0; k < 4; k++) {

        int nx = x + dx[k];
        int ny = y + dy[k];

        if (is_inside(nx, ny)) {
            if (!visited[nx][ny] && graph[nx][ny] == graph[x][y]) {
                dfs(nx, ny);
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> n;
    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        for (int j = 0; j < n; j++) {
            graph[i][j] = s[j];
        }
    }

    // 적록색약 아닌 사람 DFS
    int cnt = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (!visited[i][j]) {
                dfs(i, j);
                cnt++;
            }
        }
    }

    memset(visited, 0, sizeof(visited));

    // 적록색약을 위해 그래프 편집
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == 'G')
                graph[i][j] = 'R';
        }
    }

    int cnt_2 = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (!visited[i][j]) {
                dfs(i, j);
                cnt_2++;
            }
        }
    }
    cout << cnt << " " << cnt_2;

    return 0;
}