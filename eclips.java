public class method{
    public static void oddEven(int n){
        if(n%2 == 0){
            System.out.println("even no");
        }else{
            System.out.println("odd no");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextint();
        oddEven(n);
    }
}