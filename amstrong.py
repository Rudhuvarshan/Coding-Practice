n=int(input())
v=n
ac=v
res=0
l=0
while n>0:
    l+=1
    n=n//10

for i in range(0,l):
    v1=v%10
    v2=1
    for j in range(0,l):
        v2*=v1
    res+=v2
    v=v//10
if res==ac:
    print("true")
else:
    print("false")



