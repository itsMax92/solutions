public class Recurssion {

    public static int Summation(int n){
        if (n <= 0){  //Additive identity
            return 0;
        }else{
            return n + Summation(n-1);
        }
    }
    public static int Factorial(int n){
        if (n <= 1){    //Multiplicative identity
            return 1;
        }else{
            return n * Factorial(n-1);
        }
    }
    public static int Exponentitaion(int n ,int p){
        if (p <= 0){
            return 1;
        }else{
            return n * Exponentitaion(n,p-1);
        }
    }
    public static void main(String... args){

        System.out.println(Summation(5));
        System.out.println(Factorial(5));
        System.out.println(Exponentitaion(5,3));

    }
}
