n=int(input())
a=0
if n<0:
    a=n*-1
else:
    a=n
for i in range(1,a+1):
    if a%i==0:
        print(i,end=",")