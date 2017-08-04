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
               if(i<10){
                   return i;
               }
                   int one =  myString.charAt(myString.length()-2)-48;
                   int two = myString.charAt(myString.length()-1)-48;
                   if(one<=two){
                       return i;
                   }
            }

        }

        return number;
    }
}
