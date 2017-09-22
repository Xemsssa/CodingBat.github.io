public boolean lastDigit(int a, int b, int c) {
  if (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10) {
    return true;
  }
  
  return false;
}
npublic int blueTicket(int a, int b, int c) {
  int ab = a + b;
  int bc = b + c;
  int ac = a + c;
  
  if (ab == 10 || bc == 10 || ac == 10) {
    return 10;
  } else if (ab == 10 + bc || ab == 10 + ac) {
      return 5;
  }
  
  return 0;
}