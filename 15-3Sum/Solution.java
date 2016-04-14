public class Solution {
    public List<List<Integer>> threeSum(int[] num)  
    {  
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();  
        if(num==null || num.length<=2)  
            return res;  
        Arrays.sort(num);  
        for(int i=num.length-1;i>=2;i--)  
        {  
            //跳过重复的元素
            if(i<num.length-1 && num[i]==num[i+1])  
                continue;  
             List<List<Integer>> curRes = twoSum(num,i-1,-num[i]);  
             for(int j=0;j<curRes.size();j++)
             {  //对应把 num[i]加上
                 curRes.get(j).add(num[i]);  
             }  
             res.addAll(curRes);  
        }  
        return res;  
    }  
    private List<List<Integer>> twoSum(int[] num, int end,int target)  
    {  
        List<List<Integer>> res = new ArrayList<List<Integer>>();  
        if(num==null || num.length<=1)  
            return res;  
        int l = 0;  
        int r = end;  
        while(l<r)  
        {  
            if(num[l]+num[r]==target)  
            {  
                List<Integer> item = new ArrayList<Integer>();  
                item.add(num[l]);  
                item.add(num[r]);  
                res.add(item);
                l++;  
                r--;  
                //避免重复解
                while(l<r&&num[l]==num[l-1])  
                    l++;  
                while(l<r&&num[r]==num[r+1])  
                    r--;  
            }  
            else if(num[l]+num[r]>target)  
            {  
                r--;
            }  
            else  
            {  
                l++;
            }
        }
        return res;  
    }
}