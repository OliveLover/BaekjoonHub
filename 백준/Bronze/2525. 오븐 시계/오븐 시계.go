package main

import (
    "fmt"
    "bufio"
    "os"
)

func main() {
    reader := bufio.NewReader(os.Stdin)

    var hours, minutes, timer int
    
    fmt.Fscanf(reader, "%d %d\n%d", &hours, &minutes, &timer)

    addHours := timer / 60;
    addMinutes := timer % 60;
    
    hours += addHours
    minutes += addMinutes

    if minutes >= 60 {
        hours += 1
        minutes %= 60
    }

    if hours >= 24 {
        hours %= 24
    }

    fmt.Printf("%d %d", hours, minutes)
}