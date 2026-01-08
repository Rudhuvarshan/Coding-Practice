a=[1,2,3]
b=[4,5,6,7,8]
res=[]
c=max(len(a),len(b))
d=min(len(a),len(b))
for i in range(d):
    if i==len(a)-1:
        res.append(a[i])
    else:
        res.append(a[i])
        res.append(b[i])
for j in range(d,len(b)):
    res.append(b[j])
print(res)