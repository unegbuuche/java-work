public class TryingMethods {
    // A class that combines static and dynamic Methods

    public static void main(String[] args) {
        System.out.println("The sum between 1 to 100 is:    " + thousandSum());
        System.out.println("The sum between 12 to 103 is:    " +  betweenSum());

        TryingMethods instanceVar = new TryingMethods();
        System.out.println(instanceVar.dayOfWeek(7));
        instanceVar.printGrade(69);
    }

    public String dayOfWeek(int number) {
        switch(number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Number should be from 1 to 7";
        }
    }

    public void printGrade(int grade) {
        if(grade < 40) {
            System.out.println("Result:  F");
        }
        else if(grade < 45) {
            System.out.println("Result:  E");
        }
        else if(grade < 50) {
            System.out.println("Result:  D");
        }
        else if(grade < 60) {
            System.out.println("Result:  C");
        }
        else if(grade < 70) {
            System.out.println("Result:  B");
        }
        else if(grade <= 100) {
            System.out.println("Result:  A");
        }
        else {
            System.out.println("Don't know about this grade...");
        }
    }

    public static int thousandSum() {
        int sum = 0;
        int count = 1;

        while(count < 1000) {
            sum += count;
            count += 1;
        }

        return sum;
    }

    public static int betweenSum() {
        int sum = 0;
        for (int i = 12; i <= 103; i++) {
            sum += i;
        }
        return sum;
    }
}