class SizeofDataTypes{
    public static void main(String args[]){
        int integerSize= Integer.BYTES;
        float   floatSize= Float.BYTES;
        double doubleSize= Double.BYTES;
        int charSize= Character.BYTES;
        System.out.println("Size of Integer is "+integerSize+" bytes");
        System.out.println("Size of Float is "+floatSize+" bytes");
        System.out.println("Size of Double is "+doubleSize+" bytes");
        System.out.println("Size of Character is "+charSize+" bytes");
    }
}