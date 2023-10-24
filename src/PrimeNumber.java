public class PrimeNumber {

    public static void main(String[] args) {
        int num=3;
        int c=2;
        boolean flag=Boolean.FALSE;
        while(c<num){
            if(num%c==0){
                System.out.println("not prime no");
                flag=Boolean.TRUE;
                break;
            }
            c++;
        }
        if(!flag) {
            System.out.println("prime no :-)");
        }
    }
}
