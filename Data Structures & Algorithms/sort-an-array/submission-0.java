class Solution {

    public int[] sortArray(int[] nums) {

        return mergeSort(nums);
    }

    public int[] mergeSort(int[] arr){
        // BASE Case
        // An array with 0 or 1 element is already sorted
        if(arr.length <= 1){
            return arr;
        }

        // Find middle 
        int mid = arr.length / 2;

        // Create LEFT half (0 is included, mid is not included)
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));

        // Create RIGHT half (mid is icluded, arr.legth is not included)
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        // Merge sorted left and right and return the sorted array
        return merge(left, right);
    }

    public int[] merge(int[] first, int[] second){

        // New array big enough to hold both arrays
        int[] temp = new int[first.length + second.length];

        int i = 0; int j = 0; int k = 0;

        // Compare elements from both arrays
        while(i < first.length && j < second.length){
            if(first[i] <= second[j]){
                temp[k] = first[i];
                i++;

            }else{

                temp[k] = second[j];
                j++;
            }
            k++;
        }
        // If elements remian in first array
        while(i < first.length){
            temp[k] = first[i];
            i++;
            k++;
        }

        // If elements remain in second array
        while(j < second.length){
            temp[k] = second[j];
            j++;
            k++;
        }

        // Return the new sorted array
        return temp;
    }
    
}