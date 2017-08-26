public int max1020(int a, int b) {
  // if ( (a >= 10 && a <= 20) && (b >= 10 && b <= 20) ) {
  //   if (a > b) {
  //     return a;
  //   } else {
  //     return b;
  //   }
  // } else {
  //   return 0;
  // }
  
  int max = 0;
  int min = 0;
  if (a > b) {
    max = a;
    min = b;
  } else {
    max = b;
    min = a;
  }
  
  if (max >= 10 && max <= 20) {
    return max;
  } else {
    if (min >= 10 && min <= 20) {
      return min;
    } else {
      return 0;
    }
  }
  
  
  
}
