#include <stdio.h>

int main() {
    int hours = 0, minutes = 0, timer = 0;

    scanf("%d %d\n%d", &hours, &minutes, &timer);

    int addHours = timer / 60;
    int addMinutes = timer % 60;

    hours += addHours;
    minutes += addMinutes;
    
    if(minutes >= 60) {
        hours += 1;
        minutes %= 60;
    }

    if(hours >= 24) {
        hours %= 24;
    }

    printf("%d %d", hours, minutes);

    return 0;
}