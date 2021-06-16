package java8.stream;

public class CP {
    public static String superReducedString(String s) {

        int len = s.length();

        System.out.printf("length: ",+len);

        for(int i = 0 ; i<len-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                s.replace(s.charAt(i),s.charAt(i+1));
                len-=2;
            }

        }
        if(len == 0){
            System.out.println("Empty String");
        }

        return s;

    }

    public static void main(String[] args) {
        String str = "aaabccddd";
        System.out.println(superReducedString(str));


    }
}
