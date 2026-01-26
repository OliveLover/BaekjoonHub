package main

import (
    "fmt"
    "bufio"
    "os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)

    var x, n, a, b int
    
    fmt.Fscanf(reader, "%d\n", &x)
    fmt.Fscanf(reader, "%d\n", &n)

    for i := 0; i < n; i++ {
        fmt.Fscanf(reader, "%d %d\n", &a, &b)

        x -= a * b
    }

    answer := "No"
    if x == 0 {
        answer = "Yes"
    }

    fmt.Println(answer)
}