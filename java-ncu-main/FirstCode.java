// class is a keyword to define a class
// SecondCode is a classname , class name should start with capital letter and the next word is also start with capital
class SecondCode{

    public static void main(int x){
        System.out.println("Hello int main");
    }

    // main is a entry point of every java program
    // static - (Attach with a class) comes in the memory when the class is loaded. Static things are access by Class
    // No need of object creation to access static things
    // public - scope is outside the package
    // String is a predefine class - Internally work on byte array
    // String is a collection of chars e.g Amit
    // args is just a argument name, and it could be anyone
    // [] - N number of arguments u can specify
    // All this String args[] is called command line argument
    // ... arr it is var args argument (Java 1.5)
    //static public  void main(String ...arr){
        static public  void main(String []arr){
        // Taking Input from the user
        // 1. Command Line Arg
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        //int a =100; // Local Variables - Local Variables has to be initalize before use
        //int b =200;
        int c ;
        c = a + b;
    //System s = new System();
    System.out.println("Hello Java "+c);
    main(100);
    // println() - Internally call print function and then it call new line for \n
    // println ()  - It is a overloaded function (String, float, double, long , int)
        // System is a class
        // out is an object , out is an object of PrintStream class
        // println is a function of PrintStream class and access using out object.
        /*
        System class composes in , out and err object */

    }
}
/*
class System{
static PrintStream out;
static InputStream in;
static PrintStream err;
}
class InputStream{

}
class PrintStream{
    void println(){

    }
}
*/