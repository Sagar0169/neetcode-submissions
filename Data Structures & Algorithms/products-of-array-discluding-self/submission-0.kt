class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val list = mutableListOf<Int>()
        for(i in nums.indices){
            var cnt =1
            for(j in nums.indices){
                if(i!=j){
                    cnt = cnt*nums[j]
                }
            }

            list.add(cnt)
        }

        return list.toIntArray()
    }
}
