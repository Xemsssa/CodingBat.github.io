public boolean evenlySpaced(int a, int b, int c) {
  int max = 0, med = 0, min = 0;
  if (a < b & b < c) {
    max = c;
    med = b;
    min = a;
  } else if (a < c & c < b) {
    max = c;
    med = b;
    min = a;
  } else if ( c < b & b < a) {
    max = a;
    med = b;
    min = c;
  } else {
    max = a;
    med = c;
    min = b;
  }
  
  
  if (max - med == med - min) {
    return true;
  } else {
    return false;
  }
  
}
