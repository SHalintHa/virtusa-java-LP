class ArrayIndexOutOfBoundDemo 
{ 
    public static void main(String args[]) 
    { 
        try{ 

            int arr[] = new int[10]; 
            arr[11] = 9;


        } 
        catch(ArrayIndexOutOfBoundsException e){ 
            System.out.println ("Array Index is Out Of Bounds"); 
        } 
    } 
} 
