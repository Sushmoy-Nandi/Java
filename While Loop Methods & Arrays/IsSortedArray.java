class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Sorting Check post\n");
        int[] ar=ArrayUtility.inputArray();
        boolean isInc=isIncreasing(ar);
        boolean isDec=isDecreasing(ar);

        if(isInc || isDec){
            System.out.println("Your array is sorted");
        }
        else{
            System.out.println("Your array is not sorted");
        }
    }

    public static boolean isDecreasing(int[] ar){
        int i=1;
        while(i<ar.length){
            if(ar[i]>ar[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isIncreasing(int[] ar){
        int i=1;
        while(i<ar.length){
            if(ar[i]<ar[i-1]){
                return false;
            }
            i++;
        }
        return true;


    }
}
