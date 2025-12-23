n={1,2,1,3,2}
res=[]
for i in n:
    if i not in res:
        res.append(i)
print(res)