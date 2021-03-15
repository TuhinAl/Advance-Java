package java8.stream;

public class CP {
    static String superReducedString(String s) {

        int len = 9;
        System.out.printf("length: ",+len);
        for(int i = 0 ; i<len-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                s.replace(s.charAt(i),s.charAt(i+1));
                len-=2;
            }

        }
        if(len == 0){
            return "Empty String";
        }

        return s;

    }

    public static void main(String[] args) {
        String str = "aaabccddd";
        CP.superReducedString(str);
    }
}
