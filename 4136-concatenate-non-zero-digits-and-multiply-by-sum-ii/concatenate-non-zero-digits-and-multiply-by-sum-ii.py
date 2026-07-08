class Solution(object):
    def sumAndMultiply(self, s, queries):
        mod=10**9+7
        n=len(s)
        p1=[0]*(n+1)
        p2=[0]*(n+1)
        p3=[0]*(n+1)
        p4=[1]*(n+1)

        for i in range(1,n+1):
            p4[i]=(p4[i-1]*10)%mod
        for i,c in enumerate(s):
            d=ord(c)-48
            p1[i+1]=p1[i]
            p2[i+1]=p2[i]
            p3[i+1]=p3[i]
            if d:
                p1[i+1]+=d
                p2[i+1]=(p2[i]*10+d)%mod
                p3[i+1]+=1
        ans=[]
        for l,r in queries:
            count=p3[r+1]-p3[l]
            if count==0:
                ans.append(0)
                continue
            x=(p2[r+1]-p2[l]*p4[count])%mod
            sum=p1[r+1]-p1[l]
            ans.append((x*sum%mod))
        return ans