class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> vec;
        unordered_map<int,int> mpp;
        for(int i=0;i<nums.size();i++){
            if(mpp.find(target-nums[i]) != mpp.end()){
                vec.emplace_back(mpp[target-nums[i]]);
                vec.emplace_back(i);
                return vec;
            }
            mpp[nums[i]]=i;
        }
        return vec;
    }
};