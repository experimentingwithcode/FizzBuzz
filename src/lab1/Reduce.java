package lab1;

public class Reduce {
    public static void main(String[] args) {
        int n=100;
        System.out.println(counter(n, 0));
    }

    private static int counter(int i, int k) {
        if (i==0){
            return k;
        }
        else if(i%2==0){
            k++;
            counter(i/2, k);
        } else if (i%2==1){
            k++;
            counter(i-1, k);
        }
        return k;
    }
}
