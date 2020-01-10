public class InfinityLoop {
    public static void main(String[] args) {

        for (double x = 10; x != 0; x=x-.1){
            System.out.println(x);
    
            if(x < 0){
                break;
            }
        }
    }
}
