class Solution{
    public static boolean esprimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int solve(int [] arr){
        int sumando = 0;
        for (int i = 0; i < arr.length; i++) {
            if (esprimo(i)) {
                sumando += arr[i];
            }
        }
        return sumando;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(solve(arr));
    }
}