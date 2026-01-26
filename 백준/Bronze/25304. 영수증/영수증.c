#include <stdio.h>

int main() {
    int x = 0, n = 0, a = 0, b = 0;
    char *answer;

    scanf("%d\n", &x);
    scanf("%d", &n);

    for (int i = 0; i < n; i++) {
        scanf("%d %d", &a, &b);

        x -= a * b;
    }

    answer = x == 0 ? "Yes" : "No";

    printf("%s", answer);

    return 0;
}