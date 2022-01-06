class Solution {
        //to cache results
    Map<String,Integer> map=new HashMap();
    public int maxHappyGroups(int batchSize, int[] groups) {
        int[] count=new int[batchSize];
        int n=groups.length;
        int res=0;
        int remgroup=0;
        for(int i=0;i<groups.length;i++)
        {
            int g=groups[i]%batchSize;
			
			//It has three cases.
			//case 1) single group is divisible by batchSize
			//case 2) two groups are divisible by batchSize
			//case 3) three or more groups are divisible by batchSize
            if(g==0)
            {
                res++;
            } else if(count[batchSize-g]>0)
            {
                remgroup--;
                res++;
                count[batchSize-g]--;
            } else{
                count[g]++;
                remgroup++;
            }
        }
        res+=dfs(0,remgroup,count,batchSize);
        return res;
    }
    
    public int dfs(int curr, int remain, int[] count, int batch)
    {
        if(remain==0)
            return 0;
        int res=0;
        String s=Arrays.toString(count);
        if(map.containsKey(s))
            return map.get(s);
			
		//if curr is zero then a fresh batch starts
        if(curr==0)
        {
            res++;
            curr=batch;
        }
       int val=0;
        for(int i=1;i<count.length;i++)
        {
            if(count[i]==0)
                continue;
            count[i]--;
			
          //curr => reduce curr by number of people in the current group and add the batch size then take modulo to determine the number of donuts remaining in the current batch
		  //remain => reduce the remaining group by one
            val=Math.max(val, dfs((curr-i+batch)%batch, remain-1 ,count, batch));
            count[i]++;
        }
        res+=val;
        map.put(s,res);
        return res;
    }
}