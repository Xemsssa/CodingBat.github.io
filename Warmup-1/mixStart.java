// mixStart

public boolean mixStart(String str) {
  // String subStr = "";
  
  // if (str.length() < 3) {
  //   return false;
  // }
  
  // subStr = str.substring(0, 3);
  
  // if (subStr.indexOf("ix") == 1) {
  //   return true;
  // } else return false;

	if (str.length() >= 3) {
    	if (str.indexOf("ix") == 1) {
      	return true;
    	} 
  	}
  
  	return false;
}
