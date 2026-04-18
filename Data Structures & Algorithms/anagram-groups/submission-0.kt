class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String,MutableList<String>>()

        for(str in strs){
            val key = str.toCharArray().sorted().joinToString("")
            if(!map.contains(key)){
                map[key]=mutableListOf()
            }
            map[key]!!.add(str)
        }

        return map.values.toList()
    }
}
