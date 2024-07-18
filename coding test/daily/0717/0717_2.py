'''
N개의 정수로 이루어진 수열 A
A는 회전하는 수열
1 수열의 첫 번째 수인 A1칸만큼 왼쪽으로 회전
2 회전할 때 맨 왼쪽의 수는 오른쪽으로 이동
3 수열의 길이가 추가되거나 줄어들지 않는다
>> 회전한 뒤 수열 A의 첫 번째 값 출력
'''

from collections import deque
N, M = map(int,input().split()) # 수열길이 N, 회전횟수 M
alst = list(map(int, input().split()))
que = deque(alst)

for _ in range(M):
    nm = que[0]
    que.rotate(-nm)

print(que[0])

# que.rotate() method 