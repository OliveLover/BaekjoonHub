package main

import (
    "fmt"
    "bufio"
    "os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)

    var n, result int

    fmt.Fscanf(reader, "%d", &n)

    for i := 1; i <= n; i++ {
        result += i;
    }

    fmt.Println(result);
}