class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class MyExceptionEg{
    static void validate(int age) throws MyException{
        if(age < 18){
            throw new MyException("Not valid");
        }
        else{
            System.out.println("Valid");
        }
    }


    public static void main(String[] args) {
        try {
            validate(16);
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
    }
}