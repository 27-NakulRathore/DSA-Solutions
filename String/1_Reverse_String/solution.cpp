#include<iostream>
using namespace std;

class Solution{
public:
    void reverse_String(string s){
        int left = 0, right = s.length() - 1;

        while(left < right){
            char ch = s[left];
            s[left] = s[right];
            s[right] = ch;
            left++;
            right--;
        }

        cout << "Reversed string: " << s << endl;
    }
};

int main(){
    Solution obj;
    string s = "hello";
    obj.reverse_String(s);
    return 0;
}
