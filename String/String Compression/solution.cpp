#include <iostream>
#include <string>
using namespace std;

string compressString(string s) {
    string compressed = "";
    int count = 1;
    
    for (int i = 1; i <= s.length(); i++) {
        if (i < s.length() && s[i] == s[i - 1]) {
            count++;
        } else {
            compressed += s[i - 1] + to_string(count);
            count = 1;
        }
    }

    return compressed.length() < s.length() ? compressed : s;
}

int main() {
    string str;
    cin >> str;
    cout << compressString(str) << endl;
    return 0;
}
