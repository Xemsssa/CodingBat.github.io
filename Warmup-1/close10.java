// close10

public int close10(int a, int b) {
  int smallOne = Math.abs(a - 10);
  int smallTwo = Math.abs(b - 10);
  
  if (smallOne > smallTwo) {
    return b;
  } else if(smallOne < smallTwo) {
    return a;
  } else {
    return 0;
  }
}
