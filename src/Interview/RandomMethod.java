package Interview;

import java.util.Random;

public class RandomMethod {
    public static void main(String[] args) throws InterruptedException {
        int last=10;
        Random random=new Random();
        int n=random.nextInt(100);
        for(int i=1;i<=last;i++){
            System.out.print(n+" ");
            Thread.sleep(1000);
        }

    }
}
