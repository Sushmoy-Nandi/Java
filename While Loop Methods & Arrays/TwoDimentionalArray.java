public class TwoDimentionalArray {
    public static void main(String[] args) {
        int ar[][] = new int[2][3];
        ar[0][0]=9;

        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr.length);

        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while (j<arr[i].length) {
                System.out.print(arr[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
