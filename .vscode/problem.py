a = int(input())
ans = 0
bad =0
x = list(map(int, input().split()))
for i in range(0,1000):
    for j in range(0,a):
        if x[j]%2==1:
            bad =1
        else :
            x[j]=x[j]/2
    if bad ==0:
        ans =ans+1
print (ans)
