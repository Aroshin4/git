word ="wbwbwwbwbwbw"*40
w, b = list(map(int, input().split()))
a=0
for i in range(0,200):
    W=0
    B=0
    for j in range(0,200):
        if word[i+j]=="w":
            W=W+1
        elif word[i+j]=="b":
            B=B+1
        if W==w and B==b:
            print("Yes")
            a=1
            exit()
if a!=1:
    print("No")