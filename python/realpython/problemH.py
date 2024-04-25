x = list(map(int, input().split()))
A = list(map(int, input().split()))
ans=[]
for i in range(0,x[0]):
    if A[i]%x[1]==0:
        A[i]=A[i]/x[1]
        ans.append(str(int(A[i])))
output = ' '.join(ans)
print(output)
