class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Min heap - compares numbers by their frequency
        PriorityQueue<Integer> heap =
            new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        // Step 3: Add each unique number to heap
        for (int key : map.keySet()) {

            heap.offer(key);

            // Keep only k elements
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Step 4: Put heap elements into result
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;
    }
}