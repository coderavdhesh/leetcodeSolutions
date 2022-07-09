class Solution {
    public String simplifyPath(String path) {
        
        String[] paths = path.split("/");
        System.out.println(Arrays.toString(paths) );
        Stack<String> stack = new Stack<>();
        
        for(String curPath : paths)
        {
            if(!stack.empty() && curPath.equals("..")) 
                stack.pop();
            else if(!curPath.isEmpty() && !curPath.equals(".") && !curPath.equals(".."))
                stack.push(curPath);
            
            System.out.println(stack);
        }
        
        StringBuilder res = new StringBuilder();
        
        for(String s : stack){
            res.append("/" + s);
        }
        
        return res.isEmpty() ? "/" : res.toString();
    }
}