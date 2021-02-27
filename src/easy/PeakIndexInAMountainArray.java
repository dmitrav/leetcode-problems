public class PeakIndexInAMountainArray {

    private static int peakIndexInMountainArray(int[] A) {
        /* 13% faster than other Java solutions,  96% less memory usage! */

        for (int i = 1; i < A.length-1; i++) {

            if (A[i-1] < A[i] & A[i] > A[i+1]){
                return i;
            }
        }

        return 0;
    }


    private static int peakIndexInMountainArrayFaster(int[] A) {
        /* 100% faster than other Java solutions,  100% less memory usage! */

        int leftIndex = 0;
        int rightIndex = A.length-1;

        while (leftIndex != rightIndex){

            if (A[leftIndex] < A[leftIndex+1]){
                leftIndex++;
            } else {
                return leftIndex;
            }

            if (A[rightIndex] < A[rightIndex-1]){
                rightIndex--;
            } else {
                return rightIndex;
            }
        }

        return leftIndex;
    }

    public static void main(String[] args) {

        int[] mountain = {0,1,2,3,4,5,1,0};

//        System.out.println(peakIndexInMountainArray(mountain));
        System.out.println(peakIndexInMountainArrayFaster(mountain));

    }

}
