'''
개미 집합의 지름

임의의 두 개미 사이의 거리 중 가장 긴 거리를 의미
구름이는 주어진 개미집합의 지름을 D이하로 만들어야
그러기 위해서는 개미의 일부를 제거해야, 개미를 최소한으로 제거
>>
"정렬된 리스트에서 (최대-최소)가 D이하인 리스트의 최대길이"
'''
N, D = map(int, input().split())
plst = sorted(list(map(int, input().split())))

start, end = 0, 0
length = 0

while start<N and end<N:
    if plst[end] - plst[start] <= D:
        length = max(length, end-start+1)
        end += 1
    else:
        start += 1

print(N-length)