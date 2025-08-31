var sumOfEven = 0

for (i <- Range(0, 10)) {
    // Expressions vs statements
    // Expressions return a value while statement don't
    sumOfEven += (if (i % 2 == 0) i else 0)
}

println(sumOfEven)