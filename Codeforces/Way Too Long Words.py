from sys import stdin

num_words = int(stdin.readline())
words = []

for i in range(num_words):
    words.append(stdin.readline().strip())

for i,word in enumerate(words):
    if len(word) > 10:
        word = list(word)
        words[i] = str(word[0]) + str(len(word[1:-1])) + str(word[-1])
    print(words[i])
