public String stringYak(String str) {
  String result = "";
  
  if (str.contains("yak")) {
    result =  str.substring(str.indexOf("y") + 3);
  }
  
  return result;
}
