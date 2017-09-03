public String stringSplosion(String str) {
  String newStr = "";
  String finalStr ="";
  
  for (int i = 0; i < str.length(); i++) {
    newStr = str.substring(0, i + 1);
    
    finalStr += newStr;
  }
  
  return finalStr;
}
