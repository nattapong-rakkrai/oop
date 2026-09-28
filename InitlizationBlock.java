package initlization_block;

class Test {
    int a;

    //initlization block
    {
        a = 5;
        System.out.println("Initlization Block");
    }

    Test(){
        System.out.println("Constructor");
    }
}
public class InitlizationBlock {
    public static void main(String[] args) {
        Test t = new Test();
    }
}
