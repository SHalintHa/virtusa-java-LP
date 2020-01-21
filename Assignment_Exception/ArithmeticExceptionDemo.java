class ArithmeticExceptionDemo {


    public static void main(String args[]){ 

        try { 
            int x = 30, y = 0; 
            int z = x/y;

            System.out.println ("Result = " + z); 
        } 

        catch(ArithmeticException e) { 
            System.out.println ("Can't divide a number by 0"); 
        } 
    } 
} 
