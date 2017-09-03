public int array667(int[] nums) {
  int count = 0; 
  
  for (int i = 1; i < nums.length; i++) {
    if ((nums[i] == nums[i - 1]) || (nums[i] == 7)) {
      count++;
    }
  }
  
  return count;
}
