public boolean stringE(String str) {
  int start = 0; 
  int count = 0;
  
  for(int i = 0; i < str.length(); ++i) {
    int found = str.indexOf("e", i);
    
    if (found != -1) {
      count++;
    }
    
  }
  
  // while (true) {  
  //   if (found != -1) {
  //     count++;
  //   }
    
  //   if (count > 3) {
  //     return false;
  //   }
    
  //   start += 2;
    
  // }
  
   if (count >= 3) {
      return false;      
    } else {
      return true;
    }
}
