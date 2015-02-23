from sys import stdin

string = list(stdin.readline().strip())
vowels = "AOYEUI" + "AOYEUI".lower()
i = 0
while i < len(string):
    if string[i] in vowels:
        string.remove(string[i])
    else:
        string.insert(i, ".")
        string[i+1] = string[i+1].lower()
        i += 2
print("".join(string))
