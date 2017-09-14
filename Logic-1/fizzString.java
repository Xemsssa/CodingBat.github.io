public String fizzString(String str) {
  
  if (str.indexOf("f") != -1  & str.substring(str.length()) == "b") {
  // if (str.substring(0, 1) == "f" & str.substring(str.length()-1) == "b") {
    return "FizzBuzz";
  }
  
  // if (str.substring(0, 1) == "f") {
  if (str.indexOf("f") != -1 ) {
    return "Fizz";
  }
  
  // if (str.substring(str.length()-1) == "b") {
  if (str.substring(str.length()-1) == "b") {
    return "Buzz";
  }
  
  // return "Compile problems";
  return str;
}
