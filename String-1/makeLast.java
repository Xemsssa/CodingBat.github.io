public int[] makeLast(int[] nums) {
  // int[] array = [nums.length];
  // int[nums.length] array;
  
  int[] array = new int[nums.length * 2];
  
  for (int i = 0; i <= array.length-1; i++) {
    // array[i].push(0);
    if (i == nums.length*2-1) {
      array[i] = nums[i/2]; 
    } else {
    array[i] = 0;
    }
  }
  
  return array;
}
