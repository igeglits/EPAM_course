import java.util.Arrays;

class ArrayMain {
    public static void main(String[] args) {
        April();
        Arrays();
        MultiplicationTable();
        MultiArraySum();
        RvanijMassiv();
        ArrayClassMethods();
    }

    private static void April() {
        int[] array;
        int[] arrayInt = new int[100];
        int[] amountDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println(Arrays.toString(amountDays));
        System.out.println("Апрель содержит " + amountDays[3] + " дней");
        for (int i = 0; i < amountDays.length; i++) {
            if (amountDays[i] < 31) {
                amountDays[i] = 0;
            }
            arrayInt[i] = amountDays[i];
        }

        array = amountDays;
        System.out.println(Arrays.toString(array));
        System.out.println("--------------------------------------------------");
    }

    public static void Arrays() {


        int[] arrayInt = {1, 2, 3, 4, 5, 6};
        for (int element : arrayInt) {
            element *= element;
            System.out.println(element);
        }
        for (int valueInt : arrayInt) {
            System.out.println(valueInt);
        }
        System.out.println("-------------------------------------------------------");
    }

    public static void MultiplicationTable() {
        int[][] multiplicationTable = new int[5][];
        System.out.println("multiplicationTable = " + multiplicationTable);
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nCreate array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            multiplicationTable[i] = new int[5];
            System.out.println("multiplicationTable[" + i + "] = " + multiplicationTable[i]);
        }
        System.out.println("\nInitialization array");
        for (int i = 0; i < multiplicationTable.length; i++) {
            for (int j = 0; j < multiplicationTable[i].length; j++) {
                System.out.print(" " + multiplicationTable[i][j]);
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------");
    }
    public static void MultiArraySum(){
        int[][] array2D = { { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 0, 2, 0, 4, 0 } };
        int sum = 0;
        for (int[]row : array2D) {
            for (int element : row) {
                sum = sum + element;
            }
        }
        for (int[] row : array2D) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println("sum = " + sum);
        System.out.println("----------------------------------------------------");
    }public static void RvanijMassiv(){
        int[] numbers = { 1, 3, 5, 7, 9 };
        int[][] array = new int[3][];
        array[0] = numbers;
        array[2] = new int[] { 2, 4, 6, 8 };
        for (int[] row : array) {
            if (row != null) {
                for (int element : row) {
                    System.out.print(element + "");
                }
            } else {
                System.out.print(row);
            }
            System.out.println();
        }
        String[] ejgStr = new String[][] { { "null", "null" }, new String[] { "a", "b", "c" }, { new String() } }[0];
        String[] ejgStr1 = {"null"};
        String[] ejgStr2 = { null };
        System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]);
        System.out.println("-------------------------------------------------------------------");
        /*String[] ejgStr = new String[][] { { null }, new String[] { "a", "b", "c" }, { new String() } }[0];
String[] ejgStr1 = null;
String[] ejgStr2 = { null };
System.out.println(ejgStr[0] + "  " + ejgStr2[0] + "  " + ejgStr1[0]); */
    }
    public static void ArrayClassMethods(){
        int[] array = {9, 8, 7, 6, 5};
        System.out.println(Arrays.toString(array));
        int[] newArray = Arrays.copyOf(array, 8);
        System.out.println(Arrays.toString(newArray));
        int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        int[] arr3 = {1,2,5,5,5,5,5,8,9};
        System.out.println(arr1 == arr2);//сравнение ссылок на разные объекты вернет "ложь", даже при равном количестве элементов и их идентичности.
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(Arrays.equals(arr1, arr3));
        int[] intArr = {55, 57, 61, 66, 18, 19, 27, 38,10, 55, 15, 39, 51, 18, 83, 95};
        Arrays.sort(intArr);
        System.out.println("The sorted int array is:");
        System.out.println(Arrays.toString(intArr));

        int searchVal = 55;
        int retVal = Arrays.binarySearch(intArr, searchVal);
        System.out.println("The index of element 55 is : " + retVal);

        array = new int[7];
        Arrays.fill(array, -1);
        System.out.println(Arrays.toString(array));
    }
}
