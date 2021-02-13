# link: https://www.codechef.com/FEB21C/problems/HDIVISR
N = int(input())    # 2≤N≤1,000
res = 0
for a in range(9):
    if N%(a+1) == 0:
        res = (a+1)
print(res)