#include <string>
#include <vector>
#include <algorithm>

class Solution {
public:
    string frequencySort(string s) {
        vector<pair<char, int>> freq(128); // ASCII range

        for (char ch : s) {
            freq[ch].first = ch;
            freq[ch].second++;
        }

        sort(freq.begin(), freq.end(), [](const auto &a, const auto &b) {
            return a.second > b.second;
        });

        string result;
        for (auto &[ch, count] : freq) {
            if (count > 0) {
                result += string(count, ch);
            }
        }

        return result;
    }
};
