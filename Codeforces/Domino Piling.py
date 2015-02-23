from sys import stdin

input_list= [int(i) for i in stdin.readline().split(" ")]
m,n = input_list
print(int(m*n/2))
