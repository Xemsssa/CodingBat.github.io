// notString

public String notString(String str) {
  String newStr = "";
  
  if (str.length() < 3) {
    return "not " + str;
  }
  
  // newStr = str.substring(0, 3);
  
  // if ("not" == newStr) {
  //   return str;
  // } else {
  //   return "not " + str;
  // }
  
  if (str.equals("not" + str.substring(3))) {
    return str;
  } else {
    return "not " + str;
  }
}
