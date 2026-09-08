class Solution {
    public int subarraySum(int[] nums, int k) {
          int n = nums.length;
          int[] prefixSum = new int[n];

          prefixSum[0] = nums[0];
          for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1]+nums[i];
          }

          HashMap<Integer,Integer> map = new HashMap<>();
          int count =0;
          for(int i=0;i<n;i++){
            if(prefixSum[i]==k){
                count++;
            }
          int val = prefixSum[i]-k;
          if(map.containsKey(val)){
            count +=map.get(val);
          }
          
          if(!map.containsKey(prefixSum[i])){
            map.put(prefixSum[i],0);
          }
         map.put(prefixSum[i],map.get(prefixSum[i])+1);
          }
          return count;
    }
}