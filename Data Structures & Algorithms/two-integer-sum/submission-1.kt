class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val complimentsMap = mutableMapOf<Int,Int>()
        for((i,e) in nums.withIndex()){
            val compliment = target - e
            val complimentIndex = complimentsMap.get(compliment)
            if(complimentIndex!=null){
                return intArrayOf(complimentIndex,i)
            }
            complimentsMap[e]=i
        }

        return intArrayOf()
    }
}
