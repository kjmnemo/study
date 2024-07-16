def cal(alst, blst):
    asm = bsm = 0
    for i in range(M):
        for j in range(M):
            asm += arr[alst[i]][alst[j]]
            bsm += arr[blst[i]][blst[j]]
    return abs(asm-bsm)

def dfs(n, alst, blst):
    global ans
    if n == N:
        if len(alst) == len(blst): # 같은 인원으로 팀 구성
            ans = min (ans, cal(alst,blst))
        return
    dfs(n+1, alst+[n], blst) #A팀 선택
    dfs(n+1, alst, blst + [n]) #B팀 선택


N = int(input())
arr = [list(map(int, input().split()) for _ in range(N))]

M = N//2
ans = 100*M*M
dfs(0, [], [])
print(ans)