public boolean no23(int[] nums) {
  boolean result = true;
  
  for (int i = 0 ; i < nums.length; i++) {
    if (nums[i] == 2 || nums[i] == 3) {
      result = false;
    }
  }
  
 return result; 
}
