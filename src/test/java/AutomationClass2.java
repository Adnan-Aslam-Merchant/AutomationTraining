public class AutomationClass2 {

    public static void main(String[] args) {
        //System.out.println(factorialFunction(0));
        //fibonacciSeries(15);

        int[] array = {6,1,2,8,9,4,7,10,5};
        int actualArrayLength = 10;
        findMissingNumber(array, actualArrayLength);

    }

    public static long factorialFunction(int number){
        long factorialResult = 1;
        for(int i = number; i >= 1; i--){
            factorialResult = i * factorialResult;
        }
        return factorialResult;
    }

    public static void fibonacciSeries(int number){
        int first_number = 0;
        int second_number = 1;
        int result;
        System.out.print(first_number);
        System.out.print(" "+second_number);
        for (int i=1;i<=number;i++){
            result = first_number+second_number;
            System.out.print(" "+result);
            first_number = second_number;
            second_number = result;
        }
    }

    public static void findMissingNumber(int[] array, int n){
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum = array[i] +sum;
        }
        int missingNum = n*(n+1)/2 - sum;
        System.out.println("Missing number of array is: " + missingNum);
    }
}
