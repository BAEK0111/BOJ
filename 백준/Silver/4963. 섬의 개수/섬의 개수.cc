#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 51

int w, h;
int graph[MAX][MAX];
bool visited[MAX][MAX]; // 전역으로 설정하면 모두 false로 초기화됨

//상하좌우대각선
int dx[] = {-1, 1, 0, 0, 1, -1, -1, 1};
int dy[] = {0, 0, 1, -1, 1, 1, -1, -1};


void dfs(int i, int j) {
    graph[i][j] = 0;
//    visited[i][j] = true;
    for (int k = 0; k < 8; k++) {
        int x = i + dx[k];
        int y = j + dy[k];
//        if (0 <= x && x < w && 0 <= y && y < h) {
        if (graph[x][y] == 1 /*&& !visited[x][y]*/) {
            dfs(x, y);
        }
//        }
    }
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    while (true) {
        cin >> w >> h;
        if (w == 0 && h == 0) {
            break;
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                cin >> graph[i][j];
            }
        }
        int cnt = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (graph[i][j] == 1) {
                    dfs(i, j);
                    cnt++;
                }
            }
        }
        cout << cnt << endl;
    }

    return 0;
}