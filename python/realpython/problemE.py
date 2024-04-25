n = int(input())
A = []
ans=1
for i in range(n):
    A.append(int(input()))
N= sorted(A,reverse=True)
for i in range(0,n-1):
    if N[i]>N[i+1]:
        ans=ans+1
print(ans)