#include <iostream> 
#include <vector> 
using namespace std; 
class Solution { 
public: 
int removeDuplicates(vector<int>& nums) { 
  if (nums.empty()) return 0; 
  int j = 0; 
  for (int i = 1; i < nums.size(); i++) { 
    if (nums[j] != nums[i]) {
      j++; nums[j] = nums[i]; 
    } 
  }
  return j + 1;
} 
}; 
int main() { 
  Solution sol; 
  vector<int> nums; 
  int n, val; 
  cout << "Enter the number of elements: "; 
  cin >> n; 
  cout << "Enter the sorted elements: "; 
  for (int i = 0; i < n; i++) {
    cin >> val; nums.push_back(val);
  } 
  int newSize = sol.removeDuplicates(nums); 
  cout << "Array after removing duplicates: "; 
  for (int i = 0; i < newSize; i++) { 
    cout << nums[i] << " "; 
  } 
  cout << endl;
  return 0; 
}
