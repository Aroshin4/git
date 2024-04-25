x = list(map(int, input().split()))
d = list(map(int, input().split()))
p=""
s="a"*x[1]+"b"*x[2]
S=s*100000
l =["bbbbbbbbbb"] * 100000000
for i in range(0,len(d)):
    l[d[i]-1]="a"
L="".join(l)
print(L[0])
for j in reversed(range(0,1000000000)):
    if L[j]=="a":
        for k in range(0,j+1):
            p=p+L[k]
        break
print(p)




