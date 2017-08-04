import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public List<Integer> of(int number) {
        List list = new ArrayList();
//        if(number == 1){
//            return list;
//        }
//        if(number == 2){
//            list.add(2);
//            return list;
//        }
//        if(number == 3){
//            list.add(3);
//            return list;
//        }
        int i=0;
        for(i=2;i<=number;i++){
            for(int j=0;j<=number;j++) {
                if (number % i == 0) {
                    number = number / i;
                    list.add(i);
                }
            }

        }

        return list;
//        if(number%2 == 0){
//            number=number/2;
//            list.add(2);
//            if(number%2 == 0){
//                number=number/2;
//                list.add(2);
//                if(number%2==0){
//                list.add(number);
//                }
//                return list;
//            }
//            list.add(number);
//
//            return list;
//        }else{
//            number=number/3;
//            list.add(3);
//            if(number%3 == 0){
//                number=number/3;
//                list.add(3);
//                if(number%3 ==0){
//                list.add(number);
//                }
//                return list;
//            }
//            list.add(number);
//            return list;
//        }
//        return list;
    }


}
