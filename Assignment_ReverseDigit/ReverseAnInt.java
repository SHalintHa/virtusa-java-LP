public class ReverseAnInt{

    static void reverseInteger(int n){

        if(n == 0){
            return;
        }
        else{
            int rev = n % 10;
            System.out.print(rev);
            int temp_n =  n / 10;
            reverseInteger(temp_n);
        }
        
    }

    public static void main(String[] args){

        int num = 23406780;
        reverseInteger(num);

    }
}
