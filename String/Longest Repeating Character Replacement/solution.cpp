#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

class Solution {
public:
    int characterReplacement(string s, int k) {
        int head = 0, tail = 0, ans = 0;
        int count[26] = {};  // Frequency of characters in current window

        for (head = 0; head < s.size(); head++) {
            count[s[head] - 'A']++;  // Add current char to frequency map

            // While window is invalid: (window size - max freq) > k
            while (head - tail + 1 - *max_element(count, count + 26) > k) {
                count[s[tail] - 'A']--;  // Remove leftmost char
                tail++;                  // Shrink window from left
            }

            // Update max valid window length
            ans = max(ans, head - tail + 1);
        }

        return ans;
    }
};

int main() {
    Solution sol;
    
    string s;
    int k;

    // Sample Input
    cout << "Enter the string (uppercase only): ";
    cin >> s;

    cout << "Enter the value of k: ";
    cin >> k;

    int result = sol.characterReplacement(s, k);
    cout << "Longest substring length after replacement: " << result << endl;

    return 0;
}

/*

Step	head	tail	window	count summary	max count	replace count	Valid?	ans
0	  0	0	A	A=1	1	0	                                     0           ✅	    1
1	1	0	AA	A=2	2	0	✅	2
2	2	0	AAB	A=2, B=1	2	1	✅	3
3	3	0	AABA	A=3, B=1	3	1	✅	4
4	4	0	AABAB	A=3, B=2	3	2	❌	-
4	4	1	ABAB	A=2, B=2	2	2	❌	-
4	4	2	BAB	A=1, B=2	2	1	✅	4
5	5	2	BABB	A=1, B=3	3	1	✅	4
6	6	2	BABBA	A=2, B=3	3	2	❌	-
6	6	3	ABBA	A=2, B=2	2	2	❌	-
6	6	4	BBA	A=1, B=2	2	1	✅	4

✅ Final Answer: 4


*/