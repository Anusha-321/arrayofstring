package forLoopDemo;

public class classArrays {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        int sum= findSumOfArray(array);
        System.out.println("The sum of arrays are: "+sum);
    }

    private static int findSumOfArray(int[] array) {
        int sum=0;
        for (int i : array){
            sum=sum+i;
        }
        return sum;}
}

