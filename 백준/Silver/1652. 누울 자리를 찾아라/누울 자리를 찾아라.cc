#include <bits/stdc++.h>

#define endl '\n';
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    vector<string> room(n);

    for (int i = 0; i < n; i++) {
        string s;
        cin >> s;
        room[i] = s;
    }

    int row = 0, col = 0;

    for (int i = 0; i < n; i++) {
        int temp = 0;
        for (int j = 0; j < n; j++) {
            if (room[i][j] == '.') {
                temp++;
                if (temp == 2) {
                    row++;
//                    cout << "row " << i << endl;
                }
            } else {
                temp = 0;
            }
        }
    }

    for (int i = 0; i < n; i++) {
        int temp = 0;
        for (int j = 0; j < n; j++) {
            if (room[j][i] == '.') {
                temp++;
                if (temp == 2) {
//                    cout << "col " << i << endl;
                    col++;
                }
            } else {
                temp = 0;
            }
        }
    }

    cout << row << " " << col;

    return 0;
}