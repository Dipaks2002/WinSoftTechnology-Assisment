import java.util.Arrays;

class MergeArraysSolution
{
    private static void mergeArrays(int[] mergedArray, int[] secondArray, int m, int n)
    {
        int mergedIndex = m + n + 1;
        while (m >= 0 && n >= 0)
        {
            if (mergedArray[m] > secondArray[n]) {
                mergedArray[mergedIndex--] = mergedArray[m--];
            }
            else {
                mergedArray[mergedIndex--] = secondArray[n--];
            }
        }
        while (n >= 0) {
            mergedArray[mergedIndex--] = secondArray[n--];
        }
        Arrays.fill(secondArray, 0);
    }
    public static void rearrangeAndMerge(int[] firstArray, int[] secondArray)
    {
        if (firstArray.length == 0) {
            return;
        }
        int x = 0;
        for (int i: firstArray)
        {
            if (i != 0) {
                firstArray[x++] = i;
            }
        }
        mergeArrays(firstArray, secondArray, x - 1, secondArray.length - 1);
    }

    public static void main (String[] args)
    {
        /*Scanner sc=new Scanner(System.in);
        int size1=sc.nextInt();
        int size2=sc.nextInt();
        int X[]=new int[size1];
        int Y[]=new int[size2];
        for(int i=0;i<size1;i++){
                X[i]=sc.nextInt();
        }
        for(int i=0;i<size2;i++){
                Y[i]=sc.nextInt();
        }*/
        int[] firstArray = { 0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] secondArray = { 1, 8, 9, 10, 15 };
        rearrangeAndMerge(firstArray, secondArray);
        System.out.println(Arrays.toString(firstArray));
    }
}

