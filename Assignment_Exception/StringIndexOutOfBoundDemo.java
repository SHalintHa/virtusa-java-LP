class StringIndexOutOfBoundDemo 
{ 
    public static void main(String args[]) 
    { 
        try { 

            String a = "Hello World! ";
            char c = a.charAt(20);
            System.out.println(c); 
        } 
        catch(StringIndexOutOfBoundsException e) { 
            System.out.println("StringIndexOutOfBoundsException occured..."); 
        } 
    } 
} 
