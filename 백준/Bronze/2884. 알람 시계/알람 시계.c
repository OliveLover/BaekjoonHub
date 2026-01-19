#include <stdio.h>

int main() {
    int h = 0, m = 0, early = 45;
    scanf("%d %d", &h, &m);

    m -= 45;
    
    if (m < 0) {
        h -= 1;
        m += 60;

        if (h < 0) {
            h += 24;
        }
    }

    printf("%d %d", h, m);

    return 0;
}