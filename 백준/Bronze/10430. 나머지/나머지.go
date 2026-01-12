package main

import "fmt"

func main() {
    var a, b, c int
    var answer string

    fmt.Scanf("%d %d %d", &a, &b, &c)
    answer += fmt.Sprintf("%d\n", (a + b) % c)
    answer += fmt.Sprintf("%d\n", ((a % c) + (b % c)) % c)
    answer += fmt.Sprintf("%d\n", (a * b) % c)
    answer += fmt.Sprintf("%d", ((a % c) * (b % c)) % c)

    fmt.Println(answer)
}