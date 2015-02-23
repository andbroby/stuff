import sys

w_tot = int(sys.stdin.readline())
if w_tot % 2 > 0 or w_tot == 2:
    print("NO")
else:
    print("YES")
