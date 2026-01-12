import sys

line = sys.stdin.readline
a, b, c = map(int, line().split())

answer = ""
answer += str((a + b) % c) + "\n"
answer += str(((a % c) + (b % c)) % c) + "\n"
answer += str((a * b) % c) + "\n"
answer += str(((a % c) * (b % c)) % c)

print(answer)