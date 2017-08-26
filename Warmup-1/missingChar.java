// missingChar 

public String missingChar(String str, int n) {
  String newStr;
  
  newStr = str.substring(0, n) + str.substring(n+1, str.length());
  
  return newStr;
}
