class ReverseString {
    public static void main(String[]args) {
        String []s={"h","e","l","l","o"};
        String newS[]=new String[s.length];
        int index=0;
        for(int i=s.length-1;i>=0;i--){
            newS[index]=s[i];
            index++;
        }
        for(int i=0;i<s.length;i++){
            s[i]=newS[i];
        }
        for(int i=0;i<s.length;i++){
        System.out.print(s[i]+",");
        }
        
    }
}