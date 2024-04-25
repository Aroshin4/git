n = int(input())
a = list(map(int, input().split()))
A=0
B=0
N= sorted(a,reverse=True)
for i in range(0,n):
    if i%2==0:
        A=A+N[i]
    if i%2==1:
        B=B+N[i]
print (A-B)