class Solution {
    public String simplifyPath(String path) {
        Stack<String>stack=new Stack<>();
        //StringBuilder ans=new StringBuilder();
        String ans="";
        int i,n=path.length();
        String temp[]=path.split("/");
        for(String a:temp)
        {
            if (a.equals(".") || a.isEmpty()) {
                continue;
            } else if (a.equals("..")) { 
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(a);
            }
        }
        while(!stack.isEmpty())
        {
            ans="/"+stack.pop()+ans;
        }
        if(ans.length()==0)
            return "/";
        return ans;
    }
}