public int maxMod5(int a, int b) {
  if (a == b) {
    return 0;
  }
  
  if (a % 5 == b % 5 ) {
    if (a < b) {
      return a;
    } else {
      return b;
    }
  } else {
    if (a < b) {
      return b;
    } else {
      return a;
    }
  }
  
}
