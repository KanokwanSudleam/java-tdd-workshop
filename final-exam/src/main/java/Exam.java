/**
 * Created by kanokwan.sud on 8/4/2017.
 */
public class Exam {
    public long getNumber(long number) {
        for(long i = number; i>number; i--){
            if(i<number) {
                String myString = Long.toString(number);
                if(myString.charAt(0)<myString.charAt(1)) {
                    return i;

                }
            }
        }


        return number;
    }
}
