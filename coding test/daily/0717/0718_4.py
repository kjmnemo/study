lst = sorted(list(map(int, input().split())))
ans = []

a = lst[0]
b = lst[1]
c = lst[2]

if abs(a-b)==1 and abs(b-c) == 1:
    print(0)
elif abs(a-b) ==2 or abs(b-c) ==2:
    print(1)
else:
    print(2)

print(max(abs(a-b),abs(b-c))-1)