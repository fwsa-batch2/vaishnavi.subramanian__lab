public class namerev {
    public static void main(String[] args) {
        String myName = "VAISHNAVI";
        int length = myName.length();
        for(int i = length-1; i >=0; i--){
            System.out.println(myName.charAt(i));
        }

        StringBuffer nam = new StringBuffer("VAISHNAVI");
        System.out.println( nam.reverse());

    }
}


















