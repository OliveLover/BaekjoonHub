package main

import ("fmt"
        "bufio"
        "os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)

    var x, y int
    fmt.Fscanf(reader, "%d\n%d", &x, &y)

    quadrant := 0

    if x > 0 && y > 0 {
        quadrant = 1
    } else if x < 0 && y > 0 {
        quadrant = 2
    } else if x < 0 && y < 0 {
        quadrant = 3
    } else {
        quadrant = 4
    }

    fmt.Println(quadrant)
}