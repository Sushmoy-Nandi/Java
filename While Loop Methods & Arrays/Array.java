public class Array {
    public static void main(String[] args) {
        //int[] ar = new int[5];

        // ar[0]=10;
        // ar[1]=20;
        // ar[2]=30;
        // ar[3]=40;
        // ar[4]=50;

        int[] ar ={10,20,30,40,50};

        // System.out.println(ar[0]);
        // System.out.println(ar[1]);
        // System.out.println(ar[2]);
        // System.out.println(ar[3]);
        // System.out.println(ar[4]);

        // using loop

        // int index=0;
        // while(index<5){
        //     System.out.println(ar[index]);
        //     index++;
        // }

        // Array Traversal
        
        int index=0;
        while(index<ar.length){
            System.out.println(ar[index]);
            index++;
        }


        String[] strArr= new String[4];
        strArr[0]="My String";

        String[] newStrArr={"first","Second","third"};
        System.out.println(newStrArr.length);



    }
}
