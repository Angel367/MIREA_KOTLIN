fun main() {

    val inp:String = readlnOrNull().toString()
    var res: IntArray = intArrayOf(0, 0, 0, 0)
    for (symbol in inp) {
        if (symbol == 'A') res[0] += 1
        else if (symbol == 'T') res[1] += 1
        else if (symbol == 'G') res[2] += 1
        else if (symbol == 'C') res[3] += 1
    }
    print(res[0].toString() + " " + res[1].toString() + " " + res[2].toString() + " " + res[3].toString())
}