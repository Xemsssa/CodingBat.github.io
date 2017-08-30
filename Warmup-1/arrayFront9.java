// arrayFront9

public boolean arrayFront9(int[] nums) {
  Boolean bool = false;
  
  int len = nums.length;
  
  for (int i = 0; i < len; i++) {
//     // if(i = 4) {
//     if(i != 4) {
//       if (nums[i] == 9) {
//         bool = true;
//       }
//     } else {
//       continue;
//     }
//   }

    if(i >= 4) {
       break;
    }
    
    if (nums[i] == 9) {
        bool = true;
    }
  }


  return bool;
}
