package firstcode;

class main {
    public static void main(String[] args) {
        int[] array1 = {0, 1, 2, 3, 4};

        int[] array2 = new int[100];
        for(int i = 0; i < 100; i++){
            array2[i] = i;
        }
        System.out.println("The number of even numbers in array1 is:");
        System.out.println(countEvenNum(array1, 5));

        System.out.println("The number of even numbers in array2 is:");
        System.out.println(countEvenNum(array2, 100));

    }



    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if((arr[i]) % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}
