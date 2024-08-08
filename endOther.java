public boolean endOther(String a, String b) {
   a = a.toLowerCase();
   b = b.toLowerCase();
   boolean similar = true;
   int minLength = Math.min(a.length(), b.length());
  
  for (int i = 1; i <= minLength; i++){
    if (a.substring(a.length()-i).equals(b.substring(b.length()-i))){
      similar = true;
    } else {
      return !similar;
    }
  }
  
  return similar;
}
