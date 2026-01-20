H , M = map(int,input().split())
T = int(input())

a = H*60+M+T

if a>=1440 :
    a -= 1440
else :
    pass

H = a//60
M = a%60

print(H , M)