public String atFirst(String str) {
  String result = "";
  
  if (str == "") {
    return "@@";
  }
  
  if (str.length() <= 1) {
    result = str + "@";
  } else {
    result = str.substring(0,2);
  }
  return result;
}
