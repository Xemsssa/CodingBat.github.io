public String minCat(String a, String b) {
  String result = "";
  int aLen = a.length(); 
  int bLen = b.length(); 
  
  if (aLen > bLen ) {
    a = a.substring(aLen - bLen);
  } else {
    b = b.substring(bLen - aLen);
  }
  
  result =  a + b; 
  
  return result;
}
