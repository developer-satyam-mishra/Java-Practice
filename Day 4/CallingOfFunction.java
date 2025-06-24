class CallingOfFunction{
    public static void main(String args[]){
        System.out.println("Hello from main method");
        CallingOfFunction obj=new CallingOfFunction();
        obj.secondMethod();
        secondMethod();
    }

    static void secondMethod(){
        System.out.println("Hello from second method");
    }

    
}