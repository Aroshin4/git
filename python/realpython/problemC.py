n = int(input())
a = list(map(int, input().split()))
A=0
B=0
max=a[0]
for j in range(1,n+1):
    for i in range(1,n):
        if max<a[i]:
            max=a[i]
        print(max)
    if j%2==0:
        B=B+max
    if j%2==1:
        A=A+max
print(A-B)