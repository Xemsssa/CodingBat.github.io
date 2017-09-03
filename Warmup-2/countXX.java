int countXX(String str) {
  int i = 1;
  int count = 0;
  String [] newStr = str.split("");
  
  while (i <= newStr.length) {
    if (newStr[i] == newStr[i + 1]) {
      count++;
    }
    
    i++;
  }
  
  return count;
}
