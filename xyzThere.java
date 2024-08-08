public boolean xyzThere(String str) {
  boolean containsTheGoodXYZ = true;
  
  for (int i = 0; i < str.length()-2; i++){
    if (str.substring(i, i + 3).equals("xyz") && (i > 0 && str.charAt(i - 1) != '.') || (str.charAt(0) == 'x' && str.substring(i, i + 3).equals("xyz"))){
      // I agree that it's an ugly boolean expression.
      return containsTheGoodXYZ;
    } 
  }
   return !containsTheGoodXYZ;
}
