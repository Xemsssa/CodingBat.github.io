public boolean noTriples(int[] nums) {
    Boolean bool = true;
  
    for (int i = 1; i < nums.length; i ++) {
      if (nums[i-1] == nums[i] && nums[i] == nums[i + 1]) {
        bool = false;
      } else {
        bool = true;
      }
      
    }
    
    return bool;
}
