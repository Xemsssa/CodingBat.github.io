public boolean startHi(String str) {
 
  if (str.length() < 2){
    return false;
  }
  
  if (str.substring(0,2).equals("hi")) {
    return true;
  } else {
    return false;
  }
  
  // if (str.contains("hi")) {
  //   return true;
  // } else {
  //   return false;
  // }
 
  // if (str.substring(0, 1) != "hi") {
  //   return false;
  // } else {
  //   return true;
  // }
  
  
}
