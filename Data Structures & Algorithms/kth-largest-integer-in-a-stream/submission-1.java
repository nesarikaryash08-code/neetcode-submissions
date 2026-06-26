class KthLargest {

    int k;
    int[] num;
    ArrayList<Integer> arr = new ArrayList<>();

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.num = nums;
        Arrays.sort(num); 
        for (int num : num) {
            arr.add(num);
        }
    }
    
    public int add(int val) {
        if(arr.isEmpty())arr.add(val);
        else if(arr.get(arr.size()-1)<=val)arr.add(val);
        else {
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)>=val){
                arr.add(i, val);
                break;
            }
        }
        }

        return arr.get(arr.size()-k);
    }
}
