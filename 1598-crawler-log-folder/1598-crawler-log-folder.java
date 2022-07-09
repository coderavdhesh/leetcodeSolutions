class Solution {
    public int minOperations(String[] logs) {
        
        Stack<String> files = new Stack<>();
        
        for(int i =0; i<logs.length; i++)
        {
            String str = logs[i];
            
            if(str.equals("../"))
            {
                if(!files.isEmpty())
                    files.pop();
                else
                    continue;
            }
            else if (str.equals("./"))
                continue;
            else
                files.push(str);
                
        }
        
        System.out.print(files);
        return files.size();
        
    }
}