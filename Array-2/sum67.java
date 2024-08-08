public int sum67(int[] nums) {
 int sum = 0;
 
  for (int i = 0; i < nums.length; i++){
    if (nums[i] == 6){
      for (int j = i; j < nums.length; j++){
        if(nums[j] != 7){
          i = j;
        } else {
          i++;
          break;
        }
      }
      continue;
    }
    sum += nums [i];
  }
  return sum;
}
