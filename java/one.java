import java.util.Arrays;

public class one {
 
    public static void main(String[] args) {
        // String a ="abc";
        // String b = "abc";
        // System.out.println(a==b);
        // String c =new String("abc");
        // String d = new String("abc");
        // System.out.println(c==d);
        // System.out.println(c.equals(d));


        String [] [] names = {{"Chithu", "Vaishu"},{"Hasaaa","Sang"},{"Poorni","Maha"}};
        for(int i = 0 ; i < names.length; i++){
            for( int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j]  +" ");
            }
            System.out.println();
        }
    }
}


