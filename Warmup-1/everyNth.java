// evetyNth

public String everyNth(String str, int n) {
  String result = "";
  
  // for (int i = 0; i <= str.length(); i+ n) {
  //   String ch = str.substring(n,n + n);
    
  //   result = result + ch;
  // }
  
  int i = 0;
  while(i < str.length()) {
     String ch = str.substring(i,i + 1);
     
     result += ch;
     i += n;
  }
  
  return result;
}
