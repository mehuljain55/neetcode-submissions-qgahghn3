class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left=0;
        int right=people.length-1;

        int count=0;

        while(left<=right)
        {
            if(left==right)
            {
                count++;
                break;
            }

            if(people[right]==limit)
            {
                count++;
                right--;
            }else if(people[left]==limit){
                count++;
                left++;
            }else if(people[left]+people[right]<=limit){
                count++;
                left++;
                right--;
            }else{
                count++;
                right--;
            }
        }
        return count;
    }
}