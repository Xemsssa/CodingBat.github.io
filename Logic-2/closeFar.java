public boolean closeFar(int a, int b, int c) {
  int ab = Math.abs(a - b);
  int ac = Math.abs(a - c);
  int cb = Math.abs(b - c);
  
  if (ab <= 1 && ac >= 2 && cb >= 2) {
    return true;
  } else if (ac <= 1 && ab >= 2 && cb >= 2) {
    return true;
  } else {
    return false;
  }
}
