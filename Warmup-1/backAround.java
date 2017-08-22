// backAround

public String backAround(String str) {
  String newStr = "";
  
  newStr = str.substring(str.length() -1);
  
  newStr = newStr + str + newStr;
  
  return newStr;
}
