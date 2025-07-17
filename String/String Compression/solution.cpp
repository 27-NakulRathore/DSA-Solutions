#include <iostream>
#include <string>
using namespace std;

class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();

        int i=0;
        int index=0;

        while(i < n){
            char cur_char = chars[i];
            int count = 0;

            //find count of duplicates
            while(i < n && chars[i] == cur_char){
                count++;
                i++;
            }

            //do the ASSIGN work
            chars[index] = cur_char;
            index++;

            if(count > 1){
                string count_str = to_string(count);
                for(char &ch : count_str){
                    chars[index] = ch;
                    index++;
                }
            }
        }
        return index;
    }
};

int main() {
    vecotr<char> str[];
    cin >> str;
    cout << compress(str) << endl;
    return 0;
}
