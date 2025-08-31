var totalSum = 0

val array: Array[Int] = Array[Int](1, 2, 3, 4, 5)

for (item <- array) {
    totalSum += item
}

println(totalSum)