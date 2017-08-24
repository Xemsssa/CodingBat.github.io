public String delDel(String str) {
  String newStr = "";
  
  if (str.length() <= 3) {
    return str;
  }
  
  newStr = str.substring(1, 4);
  
  if (newStr.equals("del")) {
    newStr = str.substring(0, 1) + str.substring(4);
  } else {
    newStr = str;
  }
  
  // if (newStr == "del") {
  //   newStr = str.substring(0, 1) + str.substring(4);
  // } else {
  //   newStr = str;
  // }
  
  // if (str.contains("del")) {
  //   return newStr = str.substring(0, 1) + str.substring(4);
  // } else {
  //   return str;
  // }
  
  return newStr;
}
