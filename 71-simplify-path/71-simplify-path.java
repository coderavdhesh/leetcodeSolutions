class Solution {
    public String simplifyPath(String path) {
        
        String[] paths = path.split("/");
        
        Stack<String> stack = new Stack<>();
        for(String curPath : paths)
        {
            if(!stack.empty() && curPath.equals("..")) 
                stack.pop();
            else if(!curPath.isEmpty() && !curPath.equals(".") && !curPath.equals(".."))
                stack.push(curPath);
        }
        
        StringBuilder res = new StringBuilder();
        
        for(String s : stack){
            res.append("/" + s);
        }
        
        return res.isEmpty() ? "/" : res.toString();
    }
}