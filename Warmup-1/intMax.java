public int intMax(int a, int b, int c) {
  int[] array = {a, b, c};
  
  Arrays.sort(array);
  
  return array[array.length-1];
  
  // int max = 0;
  // for(int i = 0; i < array.length(); i++) {
  //   if (array[i] > max) {
  //     max = array[i];
  //   }
  // }
  
  // return max;
}
