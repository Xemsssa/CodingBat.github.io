public boolean shareDigit(int a, int b) {
  
  int leftA = a / 10; 
  int rightA = b % 10; 
  int leftB = a / 10; 
  int rightB = b % 10;
  
  if (leftA == leftB | leftA == rightB | rightA == leftB | rightA == rightB) {
    return true;
  }
  
  return false;
}