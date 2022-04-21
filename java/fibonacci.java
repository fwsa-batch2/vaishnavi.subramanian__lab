public class fibonacci {
    public static void main(String[] args){
        int a=-1;
        int b=1;
        int c;
        int number = 6;
        for(int i =1 ; i<=number ; i++){
            c= a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
