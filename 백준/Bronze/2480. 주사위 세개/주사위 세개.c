#include <stdio.h>

int main() {
    int resultCount[7] = {0};
    int times = 0;
    int maxNum = 0;
    int manyNum = 0;
    int maxCount = 0;
    int awards = 0;

    for (int i = 0; i < 3; i++) {
        scanf("%d", &times);
        resultCount[times] ++;

        if (maxNum < times) {
            maxNum = times;
        }

       if (maxCount < resultCount[times] ) {
           maxCount = resultCount[times];
       }

       if (maxCount == resultCount[times]) {
           manyNum = times;
       }
    }

    if (maxCount == 1) {
        awards = maxNum * 100;
    }

    if (maxCount == 2) {
        awards = 1000 + manyNum * 100;
    }

    if (maxCount == 3) {
        awards = 10000 + maxNum * 1000;
    }

    printf("%d", awards);
    
    return 0;
}