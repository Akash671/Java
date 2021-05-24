"""akash kumar"""
t=str(input())
p=str(input())
n=len(t)
m=len(p)

d=n-m
N=n
A=[]
A.append(t[:N-d])
A.append(t[d:N])
#ababa
#aba
c=0
while(m>0):
    s=""
    for i in range(d-c):
        s+=t[i]
    for j in range(2*d-c,N):
        s+=t[j]
    A.append(s)
    c+=1
    m=m-1
print(A)


