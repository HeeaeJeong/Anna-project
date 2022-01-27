fun main(args: Array<String>) {

    // Map -> (key, value) - pair
    // < String, Object >

    val langMap:Map<Int, String> = mapOf( 1001 to "kotlin", 1002 to "Java", 1003 to "react" )
    for ( (key, value) in langMap ){
        println("key=$key, value=$value")
    }
    println(langMap[1002])
    println(langMap.get(1001))
    println(langMap)
    println(langMap.keys)

    // 가변형 map
    val capitalCityMap:MutableMap<String, String>
        = mutableMapOf("Korea" to "Seoul", "China" to "Beijing", "Japan" to "Tokyo")
    println(capitalCityMap)
    println(capitalCityMap.keys)
    println(capitalCityMap.values)

    capitalCityMap.put("UK", "London")
    capitalCityMap.remove("China")
    println(capitalCityMap)

    val addData = mutableMapOf("USA" to "Washington", "India" to "NewDelhi")
    capitalCityMap.putAll(addData)
    println(capitalCityMap)

    // 정렬
    //var sortedByValue = capitalCityMap.toList().sortedBy { it.first }         / 올림
    var sortedByValue = capitalCityMap.toList().sortedByDescending { it.first }  // 내림
    println(sortedByValue)
        
}