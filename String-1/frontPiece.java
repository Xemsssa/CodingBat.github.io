public int[] frontPiece(int[] nums) {
   
  if (nums.length <= 2) {
    return nums;
    // array = nums;
  }
  
  int[] array = new int[2];

  for (int i = 0; i < 2; i++) {
    array[i] = nums[i];
  }
  
  return array;
}
