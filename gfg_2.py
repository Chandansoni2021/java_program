# N = 2,
u = 2
arr1 = [1, 3]
arr2=[4, 1]
Q = [1, 2]

n=2
o=[]
h=[]

for i in range(0,u):
    for j in range(0,n):
            h.append(Q[i])
            k=Q[i]*arr1[j]+arr2[j]
            o.append(k)
print(o)
for i in range(0,len(o),u):
    d=[]
    d.append(o[i])
    d.append(o[i+1])
    j=sorted(d)
    print(j[-1])



    