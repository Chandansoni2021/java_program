N = 4
arr=[4, 3, 2, 1]
j=sorted(arr)

f=0
for i in range(0,len(arr)):
    for j in range(0,(len(arr)-1)):
        if arr[i]>arr[j+1]:
            print(arr[i],arr[j+1])
            temp=arr[i]
            arr[i]=arr[j+1]
            arr[j+1]=arr[i]
            f=f+1
            print(arr[i],arr[j+1])
print(f)
if((arr==f)and f==2):
    print("Yes")
else:
    print("No")