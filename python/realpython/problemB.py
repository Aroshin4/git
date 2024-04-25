x = list(map(int, input().split()))
fans=0
a=0
for i in range(1,x[0]+1):
    ans=0
    p=i
    for j in range(1,6):
        a=p%10
        ans=ans+a
        p=int(p/10)
    if ans>=x[1] and ans<=x[2]:
        fans=fans+i
print (fans)