public class VariablesExercise {


    public static void main(String[] args) {

        //Integer variables
        int numApples, numOranges;
        int numBanana = 9;
        int totalFruit;

        numApples = 2;
        numOranges = 5;

        totalFruit = numApples + numBanana + numOranges;

        System.out.println("Total fruit");
        System.out.println(totalFruit);

        //Integer exercise
        int int1, int2, answer;

        int1=11;
        int2=3;
        answer = int1/int2;

        System.out.println("Dividing number for int");
        System.out.println(answer);

        answer = int1%int2;

        System.out.println("Modulus number for int");
        System.out.println(answer);

        answer = int1-int2;

        System.out.println("Subtracting number for int");
        System.out.println(answer);

        answer = int1*int2;

        System.out.println("Multiplication number for int");
        System.out.println(answer);

        //Doubles
        double decNum1, decNum2, decTotal;

        decNum1 = 2.2;
        decNum2=5.3;
        decTotal=decNum1+decNum2;

        System.out.println("Decimal double demo - adding");
        System.out.println(decTotal);

        decTotal=decNum1/decNum2;

        System.out.println("Decimal double exercise - divide");
        System.out.println(decTotal);

        decTotal=decNum1-decNum2;

        System.out.println("Decimal double exercise - subtract");
        System.out.println(decTotal);

        decTotal=decNum1*decNum2;

        System.out.println("Decimal double exercise - multiplication");
        System.out.println(decTotal);

        //Mixing variables
        int intTotal;
        intTotal=int1 + (int)decNum1;

        System.out.println("Adding an int to a double");
        System.out.println(intTotal);

        decTotal=(double)int1 + decNum1;

        System.out.println("Adding an int to a double");
        System.out.println(decTotal);

        //String exercise
        String printMe = "Hi, my name is Mike";

        System.out.println(printMe);

        String string1, string2;

        string1 = "Hello ";
        string2 = "World";

        String combinedString = string1 + string2;
        System.out.println(combinedString);

        int newNumber = 4;
        combinedString +=  newNumber;
        System.out.println(combinedString);

        System.out.println("Decimal double exercise - multiplication " + decTotal);

        //Boolean time!
        int testNum1 = 3, testNum2 = 4;
        Boolean boolResult = (testNum1 < testNum2);

        System.out.println("Is testNum1 < testNum2? " + boolResult);

        boolResult = (testNum1 > testNum2);
        System.out.println("Is testNum1 > testNum2? " + boolResult);

        //Relational operator exercise
        int num1, num2, num3;
        num1 = num2 = 6;
        num3 = 12;

        boolResult = (num1 == num2);
        System.out.println("num1==num2: "+ boolResult);

        boolResult = (num3 < num2);
        System.out.println("num1<num2: "+ boolResult);

        boolResult = (num1 > num2);
        System.out.println("num1>num2: "+ boolResult);

        boolResult = (num1 >= num2);
        System.out.println("num1>=num2: "+ boolResult);

        //Logical
        Boolean bool1, bool2, bool3;
        bool1 = bool2 = Boolean.TRUE;
        bool3 = Boolean.FALSE;

        boolResult = (bool1 && bool2);
        System.out.println("bool1 && bool2: " + boolResult);

        boolResult = (bool1 && bool3);
        System.out.println("bool1 && bool3: " + boolResult);

        boolResult = (bool1 || bool2);
        System.out.println("bool1 || bool2: " + boolResult);

        boolResult = (bool1 || bool3);
        System.out.println("bool1 || bool3: " + boolResult);

        boolResult = !bool1;
        System.out.println("!bool1: " + boolResult);

        boolResult =  (bool1 && bool3) || (bool1 || bool3);
        System.out.println("Merged result: " + boolResult);
    }
}
