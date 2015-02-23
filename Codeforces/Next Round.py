from sys import stdin

line1 = stdin.readline().strip()
line2 = stdin.readline().strip()

n,k = int(line1.split(" ")[0]), int(line1.split(" ")[1])
scores = [int(score) for score in line2.split(" ")]

threshold = scores[int(k) - 1]
proceeders = 0
for score in scores:
    if score >= threshold and score > 0:
        proceeders += 1
print(proceeders)
