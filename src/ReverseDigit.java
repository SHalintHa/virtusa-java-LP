public class ReverseDigit {

    public static void reverse(int n){
        if(n == 0){
            return;
        }
        else{
            int rev = n % 10;
            System.out.print(rev);
            int temp_n = n / 10;
            reverse(temp_n);
        }
    }
    public static void main(String[] args) {

        int n = 875654;
        System.out.println(n);
        reverse(n);
    }
}
