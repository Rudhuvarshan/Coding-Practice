n=[0,7,0,4,5,0,3,0,1]
for i in range(len(n)):
    for j in range(0,len(n)-1):
        if n[j]==0:
            n[j],n[j+1]=n[j+1],n[j]
print(n)

