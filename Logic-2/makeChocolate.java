public int makeChocolate(int small, int big, int goal) {
  int sum = 5;
  int count = 0;
  while(sum <= goal) {
    if (count > small) {
      return -1;
    }
    sum++;
    count++;
  }
  
  return count;
}


public int makeChocolate(int small, int big, int goal) {
  int sum = big * 5;
  int count = 0;
  for (int i = small; i >= 0; i--) {
    if ( sum < goal & i == 0) {
      return -1;
    } 
    sum++;
    count++;
  }
  return count;
}
