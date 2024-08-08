public int sum13(int[] nums) {
  int sum = 0;
  if(nums.length == 0){
    return sum;
  }
  for (int i = 0; i < nums.length; i++){
    if(nums[i] == 13){
      continue; // we tell the for loop to begin the next iteration. (so we do not add anything to sum).
    } else if ( i != 0 && nums[i - 1] == 13){ // If we do not put the i != 0 condition we get an error of Array Out of bounds.
      continue; // we tell the for loop to begin the next iteration.
    } else {
      sum += nums[i]; 
    }
  }
  return sum;
}
