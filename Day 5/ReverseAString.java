class ReverseAString{
    public static void main(String args[]){
        String name="satyam";
        int nameLenght=name.length();
        System.out.println(nameLenght);
        String rev="";
         for(int i= nameLenght-1 ;i>=0 ; i--){
             rev=rev + name.charAt(i);
         }
         System.out.println("Reverse of " + name + " is " + rev);
    }
}