#include <iostream>
#include <vector>
#include <stack>
#include <unordered_map>
using namespace std;

class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        stack<int> st;
        unordered_map<int, int> m;
        int n2 = nums2.size();

        for (int i = n2 - 1; i >= 0; i--) {
            while (!st.empty() && st.top() <= nums2[i]) {
                st.pop();
            }

            if (st.empty()) {
                m[nums2[i]] = -1;
            } else {
                m[nums2[i]] = st.top();
            }

            st.push(nums2[i]);
        }

        vector<int> ans;
        for (int i = 0; i < nums1.size(); i++) {
            ans.push_back(m[nums1[i]]);
        }

        return ans;
    }
};

int main() {
    // Sample input
    vector<int> nums1 = {2, 4};
    vector<int> nums2 = {1, 2, 3, 4};

    Solution sol;
    vector<int> result = sol.nextGreaterElement(nums1, nums2);

    // Output the result
    cout << "Next Greater Elements: ";
    for (int x : result) {
        cout << x << " ";
    }
    cout << endl;

    return 0;
}
