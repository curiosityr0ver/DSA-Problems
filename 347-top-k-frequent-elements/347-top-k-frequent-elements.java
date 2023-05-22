class Solution {
    Map<Integer, Integer> hm = new HashMap<>();
    public int[] topKFrequent(int[] nums, int k) {
        
        for(int ele: nums) {
            hm.put(ele, 1+ hm.getOrDefault(ele, 0));
        }
        
        int [] arr = new int [hm.size()];
        int ind = 0;
        for(int key: hm.keySet()) {
            arr[ind++] = key;
        }
        
        int[] res = new int[k];
        quickSort(arr, 0, arr.length-1);
        for(int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        
        return res;
    }
    
    
    int partition(int array[], int low, int high) {

    int pivot = array[high];
    
    int i = (low - 1);

    for (int j = low; j < high; j++) {
      if (hm.get(array[j]) >= hm.get(pivot)) {

        i++;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }

    }

    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;

    return (i + 1);
  }
     void quickSort(int array[], int low, int high) {
    if (low < high) {

      int pi = partition(array, low, high);
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }
               
               
               
}