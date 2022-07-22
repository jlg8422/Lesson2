public class Lesson2 {
    public static void main(String[] args) {
        String str1 = "hi";
       //Primitive types
        int number = 10;
        boolean isLearning = true;
        //double decimal1 = 8.4;
        //char myChar = 'a';

        if(isLearning == true) {
            System.out.println("true");
        }
            else{
                System.out.println("not learning");
        }
//! means not; != means not equal to
        if(number < 0) {
            System.out.println("number is not 0");
        }

        else if (number < 5) {
            System.out.println("number is less than 5");
        }

        else if (number == 10) {
            System.out.println("Number is 10");
        }

        while (number != 10) {
            System.out.println("Our Number: " + number);
//            number = number - 1;
            number++;
            //number-- = - 1

        }
        System.out.println("hello");
    }


}
