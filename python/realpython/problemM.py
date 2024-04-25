n = int(input())
a = list(map(int, input().split()))
ans=0
for i in range(0,n-1):
    ans=ans+a[i]
print(-1*ans)
