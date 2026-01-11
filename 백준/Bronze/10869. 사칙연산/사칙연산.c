#include <stdio.h>

int main() {
    int a = 0, b = 0;

    scanf("%d %d", &a, &b);
    printf("%d\n%d\n%d\n%d\n%d\n", a + b, a - b, a * b, a / b, a % b);

    return 0;
}