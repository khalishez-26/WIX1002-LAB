public class Question1{
    public static int TriangularNum(int n){
        for(int i = 1; i <= 20; i++){
            n += i;
        }
        return n;
    }

    public static void main(String[] args){
        int n = 0;

        for(int i = 1; i <= 20; i++){
            System.out.print(i);
            if(i < 20){
                System.out.print(" + ");
            }
        }

        System.out.println("\nThe 20th triangular number is: " + TriangularNum(n));
    }
}
