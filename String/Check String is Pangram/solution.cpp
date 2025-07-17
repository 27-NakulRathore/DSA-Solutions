#include <iostream>
#include <string>
#include <unordered_set>
#include <cctype>
using namespace std;

bool isPangram(string s) {
    unordered_set<char> letters;
    for (char c : s) {
        if (isalpha(c)) {
            letters.insert(tolower(c));
        }
    }
    return letters.size() == 26;
}

int main() {
    string str;
    getline(cin, str); // take input including spaces
    if (isPangram(str))
        cout << "Pangram" << endl;
    else
        cout << "Not a Pangram" << endl;
    return 0;
}
