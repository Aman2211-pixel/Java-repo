package code;

public class myclass {
    public static void main(String[] args) {
        helloworld();
//        int i = addNumber();
         int a =10;
         int b =20;
         int w=132;
         int k= 56;
        System.out.println(a+b);
        System.out.println(w+k);
    }
         static void helloworld(){
            System.out.println("hello from method:");
        }
        static int addNumber(int a, int b){
        return a+b;
        }
        static double addNumber(double w, double k){
        return w+k;
        }
}
