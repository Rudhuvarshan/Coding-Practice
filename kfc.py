
# Sample input
# dinein        takeaway
# 2               3
# Pizza          Coke
# Coke           Burger
#                Pasta
# Sample output
# Ordered items: Pizza,Coke
# Total amount: 300.0

# Ordered items: Coke,Burger,Pasta
# Total amount: 300

a=input()
b=int(input())                             
arr=[]
total=0
for i in range(b):
    v=list(map(str,input().split()))
    arr+=v

for i in arr:
    if i=="Pizza":
        total+=200
    elif i=="Pasta":
        total+=80
    elif i=="Burger":
        total+=150
    elif i=="Coke":
        total+=50
if a=="dinein":
    temp=total*20/100
    total+=temp
else:
    total+=20
res=""
for i in range(b):
    res+=arr[i]
    if i!=b-1:
      res+=","
print("Ordered items:",res)
print("Total amount:",total)

