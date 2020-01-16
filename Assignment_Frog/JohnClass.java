import java.util.Scanner;
class JohnClass{

    public static void main(String[] args) {

        Frog john = new Frog();


        Scanner scanner = new Scanner(System.in);
            System.out.println("1) Enter 1 to jump a distance.");
            System.out.println("2) Enter 2 to jump a for a time.");
            
            switch(scanner.next()){
                case "1":
                    System.out.println("Distance : ");
                    int d = scanner.nextInt();
                break;
                case "2":
                    System.out.println("Time : ");
                    int t = scanner.nextInt();
                break;
                
            }


    }


}