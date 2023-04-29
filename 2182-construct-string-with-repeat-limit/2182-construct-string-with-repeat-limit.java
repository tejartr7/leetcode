class Solution {
    public String repeatLimitedString(String s, int limit) {
        int i,j,n=s.length();
        StringBuilder ans=new StringBuilder();
        int arr[]=new int[26];
        for(i=0;i<n;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(i=25;i>=0;i--)
        {
            if(arr[i]<=limit && arr[i]>0)
            {
                String temp="";
                temp+=(char)(i+'a');
                temp=temp.repeat(arr[i]);
                ans.append(temp);
                arr[i]=0;
            }
            else if(arr[i]>limit)
            {
                String temp="";
                temp+=(char)(i+'a');
                temp=temp.repeat(limit);
                ans.append(temp);
                arr[i]-=limit;
                while(arr[i]>0){
                    boolean found=false;
                    for(j=i-1;j>=0;j--)
                    {
                        if(arr[j]>0)
                        {
                            found=true;
                            break;
                        }
                    }
                    if(!found)
                        break;
                    ans.append((char)(j+'a'));
                    arr[j]-=1;
                    temp="";
                    temp+=(char)(i+'a');
                    int cnt=Math.min(limit,arr[i]);
                    temp=temp.repeat(cnt);
                    ans.append(temp);
                    arr[i]-=cnt;
                }
            }
        }
        return ans.toString();
    }
}