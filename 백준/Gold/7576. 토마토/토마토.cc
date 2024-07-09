#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 1001

int m, n;                 // 상자 크기
bool visited[MAX][MAX];   // 방문 기록용 배열
int graph[MAX][MAX];      // 상자 표현용 배열


// 상하좌우
int dx[4] = {-1, 1, 0, 0};
int dy[4] = {0, 0, 1, -1};

queue<pair<int, int>> q;

void bfs(void) {

    // 모든 좌표를 탐색할 때 까지 반복
    while (!q.empty()) {

        // queue의 front 좌표를 현재 좌표로 지정
        int x = q.front().second;
        int y = q.front().first;

        //queue 의 front 좌표 제거
        q.pop();

        //현재 좌표와 상하좌우로 인접한 좌표 확인
        for (int i = 0; i < 4; i++) {
            int x_new = x + dx[i];
            int y_new = y + dy[i];

            if ((0 <= x_new && x_new < m) && (0 <= y_new && y_new < n)) {
                if (!visited[y_new][x_new] && graph[y_new][x_new] == 0) {
                    graph[y_new][x_new] = graph[y][x] + 1;
                    visited[y_new][x_new] = true;
                    q.push({y_new, x_new});
                }
            }
        }
    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> m >> n;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int k;
            cin >> k;
            graph[i][j] = k;
            if (k == 1) {
                q.push({i, j});
            }
        }
    }

    bfs();

    int max = 0;

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            if (graph[i][j] == 0) {
                cout << -1;
                return 0;
            }
            if (max < graph[i][j]) {
                max = graph[i][j];
            }
        }
    }

    cout << max - 1 << endl;

    return 0;
}