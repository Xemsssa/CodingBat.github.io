public int blackjack(int a, int b) {
  if (a > 21 && b > 21) {
    return 0;
  }
  if (a == 21 || b > 21) {
    return a;
  } else if (b == 21 || a > 21) {
    return b;
  } else if (21 - a > 21 -b) {
    return b;
  } else if (21 - a < 21 -b) {
    return a;
  } else {
    return -1;
  }
} 
