fun countVowels(inpString: String) : Int {
    var result = 0
    for (symbol in inpString) {
        if ((symbol == 'a') or (symbol == 'e') or (symbol == 'i') or (symbol == 'o') or (symbol == 'u'))
            result += 1
    }
    return result
}