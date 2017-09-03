public boolean array123(int[] nums) {
  Boolean bool1 = false;
  Boolean bool2 = false;
  Boolean bool3 = false;
  
  // for (int i = 0; i < nums.length; i++) {
  //   if (nums[i] == 1) {
  //     bool1 = true;
  //   }
  //   if (nums[i] == 2) {
  //     bool2 = true;
  //   }
  //   if (nums[i] == 3) {
  //     bool3 = true;
  //   }
  // }
  
  int i = 0;
  while (i < nums.length) {
    if (nums[i] == 1) {
      bool1 = true;
    }
    if (nums[i] == 2) {
      bool2 = true;
    }
    if (nums[i] == 3) {
      bool3 = true;
    }
    
    i++;
  }
  
 if (bool1 && bool2 && bool3) {
    return true;
  } else {
    return false;
  }
}
