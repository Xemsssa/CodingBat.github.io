public int sum2(int[] nums) {
  int result = 0;
  
  if (nums.length == 0) {
    result = 0;
  } else if (nums.length == 1) {  
    return nums[0];
  } else {
    result = nums[0] + nums[1];
  }
  return result;

}
