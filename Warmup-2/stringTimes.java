public String stringTimes(String str, int n) {
  // return str*n;

  // String finalStr = "";
  StringBuilder finalStr = new StringBuilder();
  
  int i = 0;
  while (i < n) {
    // finalStr += str; 
    finalStr.append(str);
    i++;
  }
  
  // return finalStr;
  return finalStr.toString();
}
