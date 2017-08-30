public String stringX(String str) {
  
  if (str.length() < 3) {
    return str;
  }

  String begStr = str.substring(0, 1);
  // String endStr = str.substring(-1);
  String endStr = str.substring(str.length() - 1);
  
  String newStr = str.substring(1, str.length() - 1);
  

 
  while (true) {
    
    int ind = newStr.indexOf("x");
    
    if (ind != -1) {
      newStr = newStr.substring(0, ind) + newStr.substring(ind + 1);
    }
    
    if (ind == -1) {
      break;
    }
    
    
  }
  
  newStr = begStr + newStr + endStr; 
  
  return newStr;
  
}