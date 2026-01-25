package main

import (
    "fmt"
    "bufio"
    "os"
    "strings"
)

func main() {
    reader := bufio.NewReader(os.Stdin);

    var builder strings.Builder
    
    var t, first, second int
    
    fmt.Fscanf(reader, "%d\n", &t)

    for i := 0; i < t; i++ {
        fmt.Fscanf(reader, "%d %d\n", &first, &second)

        builder.WriteString(fmt.Sprintf("%d\n", first + second))
    }

    fmt.Print(builder.String())
}