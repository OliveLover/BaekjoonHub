package main

import (
    "fmt"
    "bufio"
    "os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)
    resultCount := make([]int, 7)
    var times, maxNum, manyNum, maxCount, awards int

    for i := 0; i < 3; i++ {
        fmt.Fscanf(reader, "%d", &times)
        resultCount[times]++

        if maxNum < times {
            maxNum = times
        }
        
        if maxCount < resultCount[times] {
            maxCount = resultCount[times]
        }

        if maxCount == resultCount[times] {
            manyNum = times
        }
    }

    if maxCount == 1 {
        awards = maxNum * 100
    }

    if maxCount == 2 {
        awards = 1000 + manyNum * 100
    }

    if maxCount == 3 {
        awards = 10000 + maxNum * 1000
    }

    fmt.Println(awards)
    
}