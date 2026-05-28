class Solution {
    public void sortColors(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int n:nums)
        {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }

        int idx=0;

        while(idx!=nums.length)
        {
            if(map.containsKey(0)){
               idx=updateValue(idx,0,nums,map.get(0));
            }

            if(map.containsKey(1)){
               idx=updateValue(idx,1,nums,map.get(1));
            }

            
            if(map.containsKey(2)){
              idx= updateValue(idx,2,nums,map.get(2));
            }
        }
    }

    public int updateValue(int idx,int val,int[] nums,int freq)
    {
        while(freq!=0)
        {
            nums[idx++]=val;
            freq--;
        }
        return idx;
    }
}