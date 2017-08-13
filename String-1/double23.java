public boolean double23(int[] nums) {
  int size = nums.length;
  int count = 1;
  
  for (int i = 1; i < size; i++) {
    if (nums[i] == 2 && nums[i-1] == 2) {
      count++;
    }
    
      if (nums[i] == 3 && nums[i-1] == 3) {
      count++;
    }
  }
  
  if (count == 2) {
    return true;
  } else {
    return false;
  }
}
