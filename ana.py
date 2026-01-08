a=input("enter 1:")
a2=input("Enter 2:")
b=[]
b2=[]
v1=""
v2=""
if len(a)==len(a2):
    
    for i in a:
        b.append(i)
    for i in a2:
        b2.append(i)
    for i in range(0,len(a)):
        for j in range(0,len(a)-1):
            if b[j]<b[j+1]:
                b[j],b[j+1]=b[j+1],b[j]
            if b2[j]<b2[j+1]:
                b2[j],b2[j+1]=b2[j+1],b2[j]
    for i in b:
        v1+=i
    for i in b2:
        v2+=i

    if v1==v2:
        print("its anagram",a," ",a2)
    else:
        print("its not anagram")
    
else:
    print("its not anagram")