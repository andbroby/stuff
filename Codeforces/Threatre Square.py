from math import ceil
from sys import stdin

input = stdin.readline().split(" ")
n,m,a = int(input[0]), int(input[1]), int(input[2])
print((ceil(n/a))*(ceil(m/a)))
