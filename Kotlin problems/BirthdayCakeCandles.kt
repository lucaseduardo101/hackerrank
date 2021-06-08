import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    val highest = highestValueOnTheList (candles)   
    return timesThatAppearsInTheList(candles, highest)
}

fun timesThatAppearsInTheList(list: Array<Int>, value:Int): Int{
    var count =0
    
    list.forEach { 
        if (value.equals(it)){
            count += 1
        }
     }    
     return count
}


fun highestValueOnTheList(list: Array<Int>): Int{
    var highest = 0
    list.forEach { 
        if ( it > highest)
            highest = it
     }    
    return highest
}


fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}
