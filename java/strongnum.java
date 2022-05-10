public class strongnum {
    public static void main(String[] args) {
        int number = 145;
        int temp = number;
        int sum = 0; 
        while(number != 0){
            int mod = number % 10;
            int abc = 1;
            for(int i = 1 ; i <= mod; i++){
                abc = abc*i;
            }
            sum += abc;
            number = number / 10;
        }
            System.out.println(sum);

            if (temp == sum){
                System.out.println("The given number is a strong number.");
            }
            else{
                System.out.println("The given number is not a strong number.");
            }
    }
}
