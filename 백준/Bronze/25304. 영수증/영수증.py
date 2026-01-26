import sys

readline = sys.stdin.readline

x = int(readline())
n = int(readline())
a = b = 0

for _ in range(0, n) :
    a, b = map(int, readline().split())

    x -= a * b

print("Yes" if x == 0 else "No", end = "")