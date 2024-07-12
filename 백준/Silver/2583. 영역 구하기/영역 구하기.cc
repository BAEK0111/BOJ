#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 101

int m, n, k;

bool visited[MAX][MAX];
int graph[MAX][MAX];

// 범위 내에 있는지 확인
bool is_in(int x, int y) {
    return (0 <= x && x < m && 0 <= y && y < n);
}

// 상하좌우
int dx[] = {0, 0, -1, 1};
int dy[] = {1, -1, 0, 0};

int dfs(int x, int y) {

    visited[x][y] = true;
    int cnt = 1;

    for (int k = 0; k < 4; k++) {
        int nx = x + dx[k];
        int ny = y + dy[k];

        if (is_in(nx, ny)) {
            if (!visited[nx][ny] && graph[nx][ny] == 1) {
                cnt += dfs(nx, ny);
            }
        }
    }
    return cnt;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m >> n >> k;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            graph[i][j] = 1;
        }
    }

    while (k--) {
        int a, b, c, d;
        cin >> a >> b >> c >> d;
        for (int i = b; i < d; i++) {
            for (int j = a; j < c; j++) {
                graph[i][j] = 0;
            }
        }
    }

//    for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            cout << graph[i][j] << " ";
//        }
//        cout << endl;
//    }


    vector<int> res;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (graph[i][j] == 1 && !visited[i][j]) {
                res.push_back(dfs(i, j));
            }
        }
    }

    sort(res.begin(), res.end());
    cout << res.size() << endl;
    for (int i = 0; i < res.size(); i++) {
        cout << res[i] << " ";
    }
    cout << endl;

    return 0;
}