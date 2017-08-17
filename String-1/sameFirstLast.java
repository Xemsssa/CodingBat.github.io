public boolean sameFirstLast(int[] nums) {
  boolean bool = false;
  
  if (nums.length >= 1 && nums[0] == nums[nums.length-1]) {
    bool = true;
  }
  
  return bool;
}
