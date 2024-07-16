# 가능한 모든 경우 => 정답!
'''
dfs (n, sm
1 종료조건
if n > N:
    ans <- max (ans, sm)
    return
2 하부호출
if n + T[n] <=N:        #상담하는 경우
    dfs(n+T[n], sm + P[n])

dfs(n+1, sm)            #상담하지 않는 경우

'''

def dfs(n, sm):
    global ans
    # [1] 종료조건 : 가능한 n을 종료에 관련된 것으로 정의!
    if n >=N:
        ans = max(ans, sm)
        return
    # [2] 하부호출 : 화살표 개수만큼 호출
    if n+T[n] <= N:     # 상담하는 경우(퇴사일전 완료가능)
        dfs(n+T[n], sm+P[n])
    dfs(n+1,sm)         # 상담하지 않는 경우

N = int(input())
T = [0] * N
P = [0] * N
for i in range(N):
    T[i], P[i] = map(int, input().split())
ans = 0
dfs(0,0)
print(ans)