public String endUp(String str) {
  int len = str.length();
  String finalStr = "";
  
  if (len < 3) {
    finalStr = str.toUpperCase();
  } else {
    String subStr = str.substring(len - 3);
    
    subStr = subStr.toUpperCase();
    
    finalStr = str.substring(0, len-3) + subStr;
  }
  
  return finalStr;
}