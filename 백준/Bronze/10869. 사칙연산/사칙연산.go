package main

import "fmt"

func main() {
    var a, b int
    
    fmt.Scanf("%d %d", &a, &b)
    fmt.Printf("%d\n%d\n%d\n%d\n%d\n", a + b, a - b, a * b, a / b, a % b)
}