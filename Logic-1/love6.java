public boolean love6(int a, int b) {
  int absA = Math.abs(a);
  int absB = Math.abs(b);
  
  if (a == 6 || b == 6 | (a + b) == 6 || Math.abs(a - b) == 6) {
    return true;
  }
  
  return false;
}
