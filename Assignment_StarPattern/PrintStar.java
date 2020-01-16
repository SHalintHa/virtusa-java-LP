class PrintStar{

    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            for(int j = 10-i; j > 1; j--){
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k = 0; k < 10; k++){
            for(int j = 10-k; j < 10;j++){
                System.out.print(" ");
            }

            for(int j = 10-k; j > 1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}