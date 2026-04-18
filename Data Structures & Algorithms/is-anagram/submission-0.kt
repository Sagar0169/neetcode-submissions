class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false 

        val str = mutableMapOf<Char,Int>()

        for(s1 in s){
            str[s1]=str.getOrDefault(s1,0)+1
        }
        
        for(s1 in t){
            if(!str.contains(s1)) return false

            str[s1]=str[s1]!! - 1
            if(str[s1]==0){
                str.remove(s1)
            }
        }

        return str.isEmpty()
    }
}
