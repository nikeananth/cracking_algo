public class BonusCalculator {

    public static void main(String[] args) {
        int salary=9999;

        if(salary > 10000){
            salary=salary+2000;
        }
        else{
            salary=salary+1000;
        }
        System.out.println("salary"+salary);
    }
}
