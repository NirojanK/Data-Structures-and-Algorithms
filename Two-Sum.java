//Problem: Two sum
//Approach: Hashmap
//Time: O(n)
//Space: O(n)
//Explanation: We use a hashmap to store previously seen numbers and their indices. We can check if the difference exists in the hashmp.



public void int([]nums, int target){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length;i++){
        int diff = target - nums[i];
        if(map.containsKey(diff)){
            return new int[](map.get(diff),i);
        }
        map.put(nums[i],i);
    }
    return new int[]();
}