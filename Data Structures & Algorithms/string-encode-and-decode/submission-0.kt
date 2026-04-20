class Solution {

    fun encode(strs: List<String>): String {
        val sbr = StringBuilder()
        for(str in strs){
            sbr.append(str.length).append("#").append(str)
        }
        return sbr.toString()
    }

    fun decode(str: String): List<String> {
        val list = mutableListOf<String>()
        var i =0 

        while(i<str.length){
            var j = i 

            while(str[j]!== '#'){
                j++
            }

            val length = str.substring(i,j).toInt()
            val word = str.substring(j+1,j+1+length)

            list.add(word)
            i =j+1+length
        }

        return list
    }
}
