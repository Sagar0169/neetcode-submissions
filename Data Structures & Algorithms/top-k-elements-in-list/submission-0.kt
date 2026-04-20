class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val map = mutableMapOf<Int,Int>()
        for( i in nums){
            map[i]=map.getOrDefault(i,0)+1
        }

        return map.entries.sortedByDescending {it.value}.take(k).map{it.key}.toIntArray()
    }
}
