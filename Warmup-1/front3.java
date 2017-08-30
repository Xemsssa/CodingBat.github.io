//  front3 

public String front3(String str) {
  String newStr = "";
  
  if (str.length() < 3) {
    newStr = str;
  } else {
    newStr = str.substring(0, 3);
   
  }
  
  newStr = newStr + newStr + newStr ; 
  
  return newStr;
}
