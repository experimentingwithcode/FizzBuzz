package lab1;

public class Multiples {
    public static void main(String[] args) {
        int k=0;
        for(int i=1; i<1000; i++){
            if ((i%3==0)) {
                k++;
            }
            else{
                i++;
            }
        }
        for (int j=0; j<1000; j++){
            if ((((j%5==0) && (j%15!=0)))) {
                k++;
            }
            else{
                j++;
            }
        }
        System.out.println(k);
    }
}
