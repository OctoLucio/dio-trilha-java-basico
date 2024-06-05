tests = int(input())
for c in range(tests):
    listdieta = []
    listfinal = []
    for c in range(3):
        n = str(input())
        listdieta.append(n)
    x = listdieta[0] + listdieta[1] + listdieta[2]
    for c in x:
        if x.count(c) == 1:
            listfinal.append(c)
    h = sorted(listfinal)
    for x in h:
        print(x, end = '')  
    if len(listfinal) == 0:
            print('CHEATER')    