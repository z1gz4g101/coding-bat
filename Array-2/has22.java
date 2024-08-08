public boolean has22(int[] nums) {
  boolean has22 = false;
  
  for(int i = 0; i < nums.length-1; i++){
    if (nums[i] == 2 && nums[i + 1] == 2){
      has22 = true;
    }
  }
  return has22;
}
