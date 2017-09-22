public int loneSum(int a, int b, int c) {
  int sum = 0;
  
  if (a == b & b == c & a == c) {  
    return 0;
  }
  
  if (a == b) {
    sum = c;
  } else if (a == c) {
    sum = b;
  } else if (b == c) {
    sum = a;
  } else {
    sum = a + b + c;
  }
  
  return sum;
}
