// diff21 

public int diff21(int n) {
  int result = 0;
  
  result = Math.abs(n - 21);
  
  if ( n > 21) {
    result *= 2; 
  }
  
  return result;