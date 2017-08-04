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
               String myString = Long.toString(i);
               if (i < 10) {
                   return i;
               }

               for (int j = 1; j < myString.length(); j++) {
                   int one = myString.charAt(myString.length() - j - 1) - 48;
                   System.out.println("test"+j);
                   System.out.println("one"+one);

                   if(one!=0){
                       System.out.println("test00000");
                           System.out.println("test00000");
                           int two = myString.charAt(myString.length() - j) - 48;
//                       if(i<999) {
//                           if(one>=two){
//
//                           }
//                       }
                           if (one <= two) {
                           return i;
                       }else{
                           break;
                       }

                   }

               }
           }
               }
//                   int one =  myString.charAt(myString.length()-2)-48;
//                   int two = myString.charAt(myString.length()-1)-48;
//                   if(one<=two){
//                       return i;
//                   }


        return number;
    }
//    public String aaa(String bbb){
//        for(int i=0;i<bbb.length();i++){
//        }
//
//    }
}
