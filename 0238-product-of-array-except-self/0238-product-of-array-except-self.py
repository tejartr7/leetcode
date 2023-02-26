class Solution:
    def productExceptSelf(self, a: List[int]) -> List[int]:
        n=len(a)
        p=1
        s=0
        m=1000000007;
        for i in a:
            if i!=0:
                p=(p*i)
            else:
                s+=1
        ans=[]
        if 0 in a:
            s=a.count(0)
        if s==1:
            h=a.index(0)
            for i in range(h):
                ans.append(0)
            ans.append(p)
            for i in range(h+1,n):
                ans.append(0)
        elif s>=2:
            for i in range(n):
                ans.append(0)
        else:
            for i in range(n):
                ans.append(p//a[i])
        return ans