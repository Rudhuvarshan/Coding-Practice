n=int(input())
a=[]
while n>0:
    r=n%10
    a.append(r)
    n=n//10
total=sum(a)
if total%3==0 or total%5==0 or total%7==0:
    print("you have a lucky number")
else:
    print("your not lucky!!")