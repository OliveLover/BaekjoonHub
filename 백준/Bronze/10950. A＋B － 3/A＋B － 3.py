import sys

readline = sys.stdin.readline

t = int(readline())
result = ""

for _ in range(0, t) :
    first, second = map(int, readline().split())
    result += f"{first + second}\n"

print(result, end = "")