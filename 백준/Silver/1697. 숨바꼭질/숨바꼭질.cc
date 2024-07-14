#include <bits/stdc++.h>

#define endl '\n'
using namespace std;

#define MAX 100'001

int N, K;

//int graph[MAX];
int dist[MAX];

bool is_inside(int x) {
    return (0 <= x && x < MAX);
}

queue<int> q;

void bfs(int x) {
    q.push(x);
//    cout << "x: " << x << endl;

    while (!q.empty()) {
        int cx = q.front();
        q.pop();

        int moves[] = {cx + 1, cx - 1, cx * 2};

        for (int k = 0; k < 3; k++) {
            int nx = moves[k];

            if (is_inside(nx) && (dist[cx] + 1 < dist[nx])) {
                q.push(nx);
                dist[nx] = dist[cx] + 1;
            }
        }
    }
}


int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    cin >> N >> K;

    for (int i = 0; i < MAX; i++) {
        dist[i] = MAX;
    }

    dist[N] = 0;

    bfs(N);

    cout << dist[K] << endl;

    return 0;
}