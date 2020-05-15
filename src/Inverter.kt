
fun main(args: Array<String>) {
    val testList: MutableList<String> = mutableListOf("1", "2", "3", "4", "5")

    inverseList(testList, 0, testList.size - 1)
    for(i in testList) {
        print(i)
    }
}

private fun <T> inverseList(list: MutableList<T>, reverseFrom: Int, reverseTo: Int) {
    if (reverseFrom >= reverseTo) {
        return
    }
    val tmp = list[reverseTo]
    list[reverseTo] = list[reverseFrom]
    list[reverseFrom] = tmp
    inverseList(list, reverseFrom + 1, reverseTo - 1)
}

private fun <T> inverseListWithoutRecursion(listToInverse: List<T>): List<T> {
    return listToInverse.indices
        .map { i: Int -> listToInverse[listToInverse.size - i - 1] }
}
