public class Array {
    // public static void main(String[] args) {
    //     int[] arr = {10, 20, 30, 40};
    //     for (int i = 0; i < arr.length; i++){
    //         System.out.println(arr[i]);
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int[] arr =new int[3];
    //     for (int i = 0; i<3; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     for(int i = 0; i < 3; i++){
    //         System.out.println(arr[i]);
    //     }
    //     sc.close();
    // }


    // Sum of array
    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4};
    //     int sum = 0;

    //     for(int i = 0; i < arr.length; i++){
    //         sum+=arr[i];
    //     }
    //     System.out.println(sum);
    // }


    // Find Max/Min Element
    // public static void main(String[] args) {
    //     int[] arr ={10, 30, 40, 50, 10};
    //     int max = arr[0];
    //     int min = arr[0];
    //     // System.out.println(arr.length);
    //     for(int i = 1; i < arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //         if(arr[i] < min){
    //             min = arr[i];
    //         }
    //     }
    //     System.out.println(max);
    //     System.out.println(min);
    // }

    
    // Reverse Array
    // public static void main(String[] args) {
    //     int[] arr ={1, 2, 3};

    //     for(int i = arr.length-1;i >=0; i--){
    //         System.out.print(arr[i]);
    //     }
    // }


    // Take 5 numbers -> print sum
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     int[] arr = new int[5];
    //     for(int i = 0; i < 5; i++){
    //         arr[i] = sc.nextInt();
    //     }

    //     int num =0;
    //     for(int i = 0; i < 5; i++){
    //         // System.out.println(arr[i]);
    //         num +=arr[i];
    //     }
    //     System.out.println("Sum: "+num);
    //     sc.close();
    // }

    //Find largest number
    // public static void main(String[] args) {
    //     int[] arr = {10,201,30,12};

    //     int max = arr[0];
    //     for(int i = 1; i < arr.length; i++){
    //         if(max < arr[i]){
    //             max = arr[i];
    //         }
    //     }
    //     System.out.println(max);
    // }


    // Count even numbers
    // public static void main(String[] args) {
    //     int[] arr = {10,201,30,12};
    //     int count = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         if(arr[i] % 2 == 0){
    //             count++;
    //         }
    //     }
    //     System.out.println(count);
    // }


    // Reverse array
    // public static void main(String[] args) {
    //     int[] arr = {10,201,30,12};

    //     for(int i = arr.length-1; i>=0;i--){
    //         System.out.print(arr[i]);
    //     }
    // }

    //Second largest element
    public static void main(String[] args) {
        int[] arr = {10, 201, 30, 12};

        int max = arr[0];
        int secondMax = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if( arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
