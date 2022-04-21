public class reverse {
    public static void main(String[] args) {
        int a = 465237;
        int b,reverse=0;
        while(a!=0){
            int remainder = a % 10;
            reverse = reverse*10 + remainder;
            a = a/10;
        }
        System.out.println(reverse);
    }
}



 




                                                                     







