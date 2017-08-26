// frontBack

public String frontBack(String str) {
  String newStr = "";
  
  if (str.length() <2) {
    return str;
  }
  
  String firstChar = str.substring(0,1);
  String lastChar = str.substring(str.length()-1);
  
  newStr = lastChar + str.substring(1, str.length()-1) + firstChar;
  
  return newStr;
}
