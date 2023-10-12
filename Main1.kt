fun main() {

    var arr:List<String>

    arr = readLine().toString().split(' ')

    val a:Float = arr[0].toFloat()
    val b:Float = arr[1].toFloat()
    val m:Float = arr[2].toFloat()
    val n:Float = arr[3].toFloat()

    if (((a > m) and (b > n)) or ((a > n) and (b > m))) print("YES")
    else print("NO")

}