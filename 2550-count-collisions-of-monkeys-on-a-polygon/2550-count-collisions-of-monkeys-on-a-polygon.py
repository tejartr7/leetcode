
class Solution:
    def monkeyMove(self, n: int) -> int:
        x=n
        y=2
        m=7+10**9
        k=10000
        o=1000
        str="fdjlasldfjkdsklfjasdjklfjklsdafjkljkl"
        #leetcode contest :)
        #this is not done with dp
        return (pow(y,x,m)-2)%m