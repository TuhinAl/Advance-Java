package basic;

public class LocalClass {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumber(String firstPhoneNumber,
                                           String secondPhoneNumber) {
        final int phoneNumberLength = 10;
        class PhoneNumber {
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber) {
                String currentNumber = phoneNumber.replaceAll(regularExpression, "");
                if (currentNumber.length() == phoneNumberLength) {
                    formattedPhoneNumber = currentNumber;
                }else {
                    formattedPhoneNumber = null;
                }

            }

            public String getNumber (){
                return formattedPhoneNumber;
            };

            public void printOriginalNumber() {
                System.out.println("Original numbers are: " + firstPhoneNumber + "and  " + secondPhoneNumber);
            }
        }

        PhoneNumber one = new PhoneNumber(firstPhoneNumber);
        PhoneNumber two = new PhoneNumber(secondPhoneNumber);
        one.printOriginalNumber();

        if (one.getNumber() == null) {
            System.out.println("first Number Is Invalid.");
        } else{
            System.out.println("First Number is: " + one.getNumber());
        }

        if (two.getNumber() == null) {
            System.out.println("Second Number Is Invalid.");
        } else{
            System.out.println("First Number is: " + two.getNumber());
        }
    }


    public static void main(String[] args) {
        validatePhoneNumber("123-456-7890", "1238-4543");

    }
}
