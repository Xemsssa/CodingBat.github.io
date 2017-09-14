public int sumLimit(int a, int b) {
  int sum;
  sum = a + b;
  
  if (String.valueOf(sum).length() == String.valueOf(a).length()) {
    sum = a + b;
  } else  {
    sum = a;
  }
  
  return sum;
}
