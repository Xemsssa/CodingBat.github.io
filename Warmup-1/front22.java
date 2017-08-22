// front22

public String front22(String str) {
  
  String sybStr = "";
  if (str.length() < 2) {
    sybStr = str.substring(0);
  } else {
    sybStr = str.substring(0, 2);
  }
  
  return sybStr + str + sybStr;
}
