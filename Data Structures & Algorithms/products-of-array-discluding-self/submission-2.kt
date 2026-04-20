class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val result = IntArray(nums.size) 

        var prefix =1 
        for( i in nums.indices){
            result[i]=prefix
            prefix *=nums[i]
        }

        var suffix =1 
        for( i in nums.size-1 downTo 0 ){
            result[i]*=suffix
            suffix *=nums[i]
        }

        return result 
    }
}
