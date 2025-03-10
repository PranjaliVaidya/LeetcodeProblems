#include <iostream> 
#include <vector> 
#include <unordered_map> 
using namespace std; 
class Solution { 
public: 
vector<int> twoSum(vector<int>& nums, int target) { 
     unordered_map<int, int> mp; 
     for (int i = 0; i < nums.size(); i++) 
     { 
       int ans = target - nums[i]; 
       if (mp.find(ans) != mp.end()) 
       { 
         return {i, mp[ans]}; 
       } 
       mp[nums[i]] = i; 
     } 
    return {-1, -1}; 
} 
}; 
int main() { 
  Solution sol; 
  vector<int> nums; 
  int target, n, val; 
  cout << "Enter the number of elements: "; 
  cin >> n; cout << "Enter the elements: ";
  for (int i = 0; i < n; i++) { 
    cin >> val; nums.push_back(val); } 
  cout << "Enter the target sum: "; cin >> target;
  vector<int> result = sol.twoSum(nums, target); 
  if (result[0] != -1) { cout << "Indices of numbers that add up to target: " << result[0] << " " << result[1] << endl; }
  else { cout << "No valid pair found!" << endl; } 
  return 0;
}
