//	lastDigit

public boolean lastDigit(int a, int b) {
  int divA = a % 10;
  int divB = b % 10;
  
  if (divA == divB){
    return true;
  }
  
  return false;
}
