public class average {
    public static void main(String[] args){
        
        // simple method
        int a,b,c,d,e,f;
        a= 56;
        b=78;
        c=88;
        d=76;
        e=56;
        f=89;
        System.out.println((a+b+c+d+e+f)/6);

        // another method

        int marks[] = {56,78,88,76,56,89}; 
        int marksLength = marks.length;
        int i;
        int avg =0; 
        int n =0;
        for (i=0; i<marksLength; i++ )  
        { 
         n += avg + marks[i];
        }   
         System.out.println(n / marksLength); 
    }
}




