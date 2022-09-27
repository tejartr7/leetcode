class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        c=0
        bin1=bin(start)[2::]
        bin2=bin(goal)[2::]
        if len(bin1)>len(bin2):
            bin2='0'*(len(bin1)-len(bin2))+bin2
        else:
            bin1='0'*(len(bin2)-len(bin1))+bin1
        n=max(len(bin1),len(bin2))
        for i in range(n):
            if bin1[i]!=bin2[i]:
                c+=1
        return c