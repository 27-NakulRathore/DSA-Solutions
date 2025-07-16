#include <iostream>
#include <string>
#include <algorithm>
using namespace std;
class Solution {
public:
    int maximumLength(vector<int>& nums) {
        int n = nums.size(), evenCount  = 0, oddCount = 0;

        for(int &num : nums){
            if(num % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
            int parity = nums[0] % 2;
            int alternating = 1;

            for(int i = 1; i < n; i++){
                int curParity = nums[i] % 2;

                if(curParity != parity){
                    alternating++;
                    parity = curParity;
                }
            }

        return max({evenCount, oddCount, alternating});   
    }
};