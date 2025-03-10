#include <iostream> 
#include <string> 
using namespace std; 
class Solution { 
public: 
int lengthOfLastWord(string s) {
    int c = 0; 
  for (int i = s.length() - 1; i >= 0; i--) 
  { 
    if (s[i] != ' ')
    { 
      c++; 
    } 
    else if (s[i] == ' ' && c > 0)
    { 
      break;
    } 
  } 
  return c; 
} 
}; 
int main() 
{ 
  Solution sol; 
  string s; 
  cout << "Enter a string: "; 
  getline(cin, s); 
  int result = sol.lengthOfLastWord(s); 
  cout << "Length of the last word: " << result << endl; 
  return 0; 
}
