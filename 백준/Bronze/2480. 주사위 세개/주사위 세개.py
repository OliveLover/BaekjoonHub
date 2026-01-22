import sys

readline = sys.stdin.readline
resultCount = [0 for _ in range(7)]
awards = 0

opportunity = list(map(int, readline().split()))
for num in opportunity :
    resultCount[num] += 1

maxCount = max(resultCount)
manyNum = resultCount.index(maxCount)
maxNum = [i for i, count in enumerate(resultCount) if count != 0][-1]

if maxCount == 1 :
    awards = maxNum * 100
elif maxCount == 2 :
    awards = 1000 + manyNum * 100
else :
    awards = 10000 + manyNum * 1000

print(awards)