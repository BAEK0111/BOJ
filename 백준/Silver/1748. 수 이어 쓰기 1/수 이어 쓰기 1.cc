#include <bits/stdc++.h>

#define endl '\n';
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    long int res = 0;
    int digit_length = 1;
    int power_of_10 = 10;

    for (int i = 1; i <= n; i++) {
        if (i == power_of_10) {
            digit_length++;
            power_of_10 *= 10;
        }
        res += digit_length;
    }

    cout << res << endl;
    return 0;
}