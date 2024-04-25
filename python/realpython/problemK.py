n = int(input())
a=""
for i in range(1,n+1):
    if i%3!=0:
        a +='o'
    else:
        a +='x'
print(a)