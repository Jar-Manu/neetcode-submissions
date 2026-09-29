class Solution {
    public int removeElement(int[] nums, int val) {
        int point1 = 0, point2 = nums.length;
        while(point1 < point2){
            if(nums[point1] == val){
                nums[point1] = nums[--point2];
            }else{
                point1++;
            }
        }
        return point2;
    }
}