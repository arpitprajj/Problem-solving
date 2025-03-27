public class Check_Array_Sorted {
    

   
        public boolean check(int[] nums) {
           //by finding smallest number
                int numOfInv=0;//to count number of inversion in array
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]>nums[i+1]) numOfInv++;
                }
                // if count is more than 2 than it is not rotation of Sorted Array
                if(nums[0]<nums[nums.length-1]) numOfInv++;
                //this is also case of inversion
                if (numOfInv<=1) return true;
            
            return false;
        }
    }

