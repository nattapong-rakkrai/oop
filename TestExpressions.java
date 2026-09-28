package expressions;

public class TestExpressions {
    public static void main(String[] args) {
        System.out.println("่Java is ecerywhere");

        int num = 60;
        int bonus = 5;
        int score = 10;
        int totalscore = bonus + score;
        if (num > 50) {
            System.out.println("Number is Greater than 50");
        }
        System.out.println("The total score is: " + totalscore);
        int age = 20;
        boolean isAsult = age >= 18;
        System.out.println("The age is >= 18 " + isAsult);

        boolean hasPermission = true;
        boolean isActive = false;
        boolean canAccess = hasPermission && isActive;//Expression คือ "hasPermission && isActive"

        String firstName = "John";
        String lastName = "Doe";
        System.out.println("The first name is " + firstName);
        System.out.println("The last name is " + lastName);

    }
}