/** Anonymous Inner Class interface **/
interface AnonymousClass{

    public void displayAnonymousClass();
}


class EncapsulationEg{

    /** Inner Class **/
    class InnerClass{

        public void displayInnerClass(){
            System.out.println("This is an Inner Class");
        }

    }
    /** Inner Class **/


    /** Method Class **/
    public void getMethodClass(){

        class MethodClass{
            public void displayMethodClass(){

                System.out.println("This is a Method Class");
            }
        }

        MethodClass methodClass = new MethodClass();
        methodClass.displayMethodClass();
    }
    /** Method Class **/


    public static void main (String[] args) {

        EncapsulationEg encapsulationEg = new EncapsulationEg();

        /** Inner Class **/
        EncapsulationEg.InnerClass innerClass = encapsulationEg.new InnerClass();
        innerClass.displayInnerClass();
        
        /** Method Class **/
        encapsulationEg.getMethodClass();

        /*************************************** Annonymous Inner class ***************************************/

        AnonymousClass anonymousClass = new AnonymousClass(){
        
            @Override
            public void displayAnonymousClass() {
                System.out.println("This is an Anonymous class");
            }
        };
        
        anonymousClass.displayAnonymousClass();
        
        /*************************************** Annonymous Inner class ***************************************/

    }
}
