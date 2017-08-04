public class FormatPhoneNumber {

    public String removeNonDigit(String input) {
        input=input.replaceAll("-","");
        input=input.replaceAll(" ","");

        return input;
    }

    public String solution(String input) {
        input=removeNonDigit(input);
        String result = "";
        if (input.length()%3 == 0) {
            int i=0;
            int count=0;
            for(i=0;i<input.length();i++){
                result+=input.charAt(i);
                count++;
                if(count == 3){
                    result+="-";
                    count = 0;
                }
            }

            int last = result.length()-1;
            result=result.substring(0,last);
        }else{
            if(input.length()%3 == 1){
                int i = 0;
                int count = 0;
                for (i = 0; i < input.length(); i++) {
                    result += input.charAt(i);
                    count++;
                    if (count == 3) {
                        result += "-";
                        count = 0;
                    }
                }

                String frist = result.substring(0,result.length()-3);
                String se = result.substring(result.length()-2,result.length()-1);
                String th = result.substring(result.length()-3,result.length()-2);

                result=frist+se+th+result.substring(result.length()-1);
                return result;
//                char temp= ' ';
//                char two = result.charAt(result.length()-3);
//                char one = result.charAt(result.length()-2);
////                Character.toString(temp);
////                Character.toString(two);
////                Character.toString(one);
//
//                temp = result.charAt(result.length()-3);
//                result.charAt(result.length()-3)=result.charAt(result.length()-2);
//                result.charAt(result.length()-2)=temp;
//
//                System.out.println(two);
//                System.out.println(one);
//                System.out.println(result);



            }else {
                int i = 0;
                int count = 0;
                for (i = 0; i < input.length(); i++) {
                    result += input.charAt(i);
                    count++;
                    if (count == 3) {
                        result += "-";
                        count = 0;
                    }
                }
            }
//            result = input.substring(0, 3) + "-" + input.substring(3, 6) + "-" + input.substring(6, 9)+ "-" + input.substring(9, 12)+ "-" + input.substring(12, 14);
        }
        return result;
    }

}
