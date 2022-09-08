public class OneDArray {
    public static void main(String[] args) {
        String[] names = {"Fred","Wilma","Barney","Betty"};
        String[] names1 = new String[4];

        double[] myList = new double[10];
        myList[0] = 5.6;
        myList[1] = 4.5;
        myList[4] = 4;
        myList[2] = 3.3;
        myList[5] = 34.33;
        myList[6] = 34;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;
        myList[3] = 13.2;
        double[] myList1 =
                {5.6,4.5,3.3,13.2,4,34.33,
                        34,45.45,99.993,11123};
        // System.out.println(myList[]);  //displays the memory address, not the contents of the array
        // System.out.println(myList.length);
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }

        System.out.println();

        myList[5] = 5;
        for (int i = 0; i < myList.length; i++) {
            System.out.print(myList[i] + " ");
        }



    }
}
