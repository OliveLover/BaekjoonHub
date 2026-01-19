package main

import (
    "fmt"
    "bufio"
    "os"
)

func main () {
    reader := bufio.NewReader(os.Stdin)

    var h, m int
    ealry := 45

    fmt.Fscanf(reader, "%d %d", &h, &m)

    m -= ealry
    
    if (m < 0) {
        h -= 1
        m += 60

        if (h < 0) {
            h += 24
        }
    }

    fmt.Printf("%d %d", h, m)
}