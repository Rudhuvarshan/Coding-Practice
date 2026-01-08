a,b=map(int,input().split())
cnt=0
for n in range(a,b):
    for i in range(1,n+1):
        if n%i==0:
            cnt+=1

    if cnt==2:
        print(n)
    cnt=0
