def max_reach_impact(N, C, Q, R, b):
    dp = [[0]*(b+1) for _ in range(N+1)]
    for i in range(1, N+1):
        for j in range(1, b+1):
            dp[i][j] = dp[i-1][j]
            for k in range(len(C[i-1])):
                if C[i-1][k] <= j:
                    dp[i][j] = max(dp[i][j], dp[i][j-C[i-1][k]] + R[i-1][k]*Q[i-1][k])
    return dp[N][b]

N = int(input())
C = []
Q = []
R = []

for i in range(N):
    c, q, r = map(int, input().split())
    C.append([c])
    Q.append([q])
    R.append([r])

    k = 2
    while True:
        c, q, r = map(int, input().split())
        if c == -1 and q == -1 and r == -1:
            break
        C[i].append(c)
        Q[i].append(q)
        R[i].append(r)
        k += 1

b = int(input())

print(max_reach_impact(N, C, Q, R, b))
