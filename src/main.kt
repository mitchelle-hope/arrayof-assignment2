fun main(){
var x=arrayofnum(arrayOf(20,5,3,4))
    println(x)
    var z=(mixedtypes(arrayOf( 5.785F,"true",7,45.87,66)))
    println(z)
    var p =characters(arrayOf('m','i','t','c','h','e','l'))
    println(p)
    var y=mixedtypes(arrayOf("school",20,10,5,"allan",true,5))
    println(y)
}
//write a function that takes in an arrayof intergers and returns the product of all elements.
fun arrayofnum(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { number->
            product*=number
        }
        return product
    }
//write a function that takes in an array of mixed types and returns the sum of all decimal elements.
fun mixedtypes(mixedArray: Array<Any>):Double{
    var sum =0.00
    mixedArray.forEach { number->
        if (number is Double){
        sum+=number
        }
    }
    return sum
}
//wite a function that takes in an array of characters and returns number of vowels in string.
fun characters(letters: Array<Char>):Int{
    var p = 0
    letters.forEach { k->
        if(k=='a'||k=='e'||k=='i'||k=='o'||k=='u'){
            p++
        }
    }
return p
    }

//create a function that takes in an arrayof mixed types and sums up the intergers only. returns sum
fun sumIntergers(mixedArray: Array<Any>):Int{
    var sum = 0
    mixedArray.forEach { num->
        if (num is Int){
            sum+=num
        }
    }
    return sum
}

