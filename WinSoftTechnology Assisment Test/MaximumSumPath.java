class MaxSumFinder {
    public static int findMaxSum(int[] array1, int[] array2) {
        int sum = 0;
        int sumArray1 = 0, sumArray2 = 0;
        int length1 = array1.length, length2 = array2.length;
        int index1 = 0, index2 = 0;
        
        while (index1 < length1 && index2 < length2) {
            while (index1 < length1 - 1 && array1[index1] == array1[index1 + 1]) {
                sumArray1 += array1[index1++];
            }
            while (index2 < length2 - 1 && array2[index2] == array2[index2 + 1]) {
                sumArray2 += array2[index2++];
            }
            
            if (array2[index2] < array1[index1]) {
                sumArray2 += array2[index2];
                index2++;
            } else if (array1[index1] < array2[index2]) {
                sumArray1 += array1[index1];
                index1++;
            } else {
                sum += Integer.max(sumArray1, sumArray2) + array1[index1];
                index1++;
                index2++;
                sumArray1 = 0;
                sumArray2 = 0;
            }
        }
        
        while (index1 < length1) {
            sumArray1 += array1[index1++];
        }
        while (index2 < length2) {
            sumArray2 += array2[index2++];
        }
        
        sum += Integer.max(sumArray1, sumArray2);
        
        return sum;
    }
    
    public static void main(String[] args) {
        int[] array1 = { 3, 6, 7, 8, 10, 12, 15, 18, 100 };
        int[] array2 = { 1, 2, 3, 5, 7, 9, 10, 11, 15, 16, 18, 25, 50 };
        System.out.println(findMaxSum(array1, array2));
    }
}

