/**
 * Created by kanokwan.sud on 8/4/2017.
 */
public class Exam {
    public long getNumber(long number) {
        if(number<10){
            return number;
        }
        for(long i = number; i>=0; i--){
            System.out.println(i+"i");
           if(i<number) {
               System.out.println("i<number");
               String myString = Long.toString(i);
                //for (int j = 0; j <= myString.length(); j++) {
                //String myString = Long.toString(number);
                 //int one =  myString.charAt(j)-48;
                 //int two = myString.charAt(myString.length())-48;
//                //}
               int one =  myString.charAt(0)-48;
               int two = myString.charAt(myString.length()-1)-48;
               System.out.println(one);
               System.out.println(two);
               if(i<10){
                   return i;
               }
               if(one<=two){
                   return i;
               }
            }

        }

        return number;
    }
}
