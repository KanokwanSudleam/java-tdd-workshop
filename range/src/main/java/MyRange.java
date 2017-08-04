public class MyRange {
    public String of(String input) {
        int i = 0;
        String result="";
        for(i = getFirstNumber(input);i<=getLastNumber(input);i++){
            result+=i;
        }
        return result;
    }

    public int getLastNumber(String input) {
        if(isก้ามปูปิด(input)){
            return input.charAt(3)-48;
        }

        return input.charAt(3)-49;
    }

    public boolean isก้ามปูปิด(String input) {
        if(input.endsWith("]")){
            return true;
        }
        return false;
    }

    public int getFirstNumber(String input) {
        if(isก้ามปูเปิด(input)){
            return input.charAt(1)-48;
        }

        return input.charAt(1)-47;
    }

    public boolean isก้ามปูเปิด(String input) {
        if(input.charAt(0) == '['){
            return true;
        }
        return false;
    }
}
