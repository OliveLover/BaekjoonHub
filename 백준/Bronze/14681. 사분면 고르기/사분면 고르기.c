#include <stdio.h>

int main() {
    int x = 0, y = 0, quardrant = 0;

    scanf("%d %d", &x, &y);

    if (x > 0 && y > 0) {
        quardrant = 1;
    } else if (x < 0 && y > 0) {
        quardrant = 2;
    } else if (x < 0 && y < 0) {
        quardrant = 3;
    } else {
        quardrant = 4;
    }

    printf("%d", quardrant);
    
    return 0;
}