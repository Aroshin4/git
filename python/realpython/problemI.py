s = input()
L = len(s)
ans = set()
for i in range(0,L):
    for j in range(i+1,L+1):
        ans.add(s[i:j])
print(len(ans))