a=[0,1,1,2,2,2,2,3,1,1,2]
res=[]
temp=None
for i in a:
    if i!=temp:
        res.append(i)
        temp=i
print(res)


# Output: [0, 1, 2, 3, 1, 2]