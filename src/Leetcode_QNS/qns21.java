package Leetcode_QNS;
//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class qns21 {


    public static void main(String[] args) {
        int[] arr= {1,1,2,3,3,4,4,8,8 };
        System.out.println(singleNonDuplicate(arr));
    }

// bit manipulation

  static   public int singleNonDuplicate(int[] nums) {

        int   s=0;
        int val=nums[0];
        for(int i=1;i<nums.length;i++){
            val=val^nums[i];
        }
        return val;
    }





    // 2nd method BS

//    public int singleNonDuplicate(int[] nums) {
//        if(nums.length==1){
//            return nums[0];
//        }
//        int start=0;
//        int end=nums.length-1;
//        while(start<=end){
//            if(start==end){
//                return nums[start];
//            }
//            int mid=(start+end)/2;
//            int left=nums[mid-1];
//            int right=nums[mid+1];
//            if(left!=nums[mid]&&right!=nums[mid]){
////if element to the right and left both are not equal to the mid,then mid one is the answer
//                return nums[mid];
//            }
//            if(left==nums[mid]){
//                int num_of_elements_left=mid-1;
////if the number of elements on any side is even, that means every number is repeated twice. Therefore, we have to loop over the odd number of elements array
//                if(num_of_elements_left%2!=0){
//                    end=mid-2;
//                    continue;
//                }else{
//                    start=mid+1;
//                }
//            }else{
//                int num_of_elements_right=end-mid+1;
//                if(num_of_elements_right%2!=0){
//                    start=mid+2;
//                    continue;
//                }else{
//                    end=mid-1;
//                }
//            }
//
//        }
//        return nums[start];
//
//    }
}
