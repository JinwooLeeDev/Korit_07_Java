package ch07_loops;
/*
    1 2 3 4 5 6 ... 10
    11 12 13 ... 20
    ...
    91 ... 100
 */
public class Loop02 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        int count=0;

        // 1번 풀이
        while (i<100) {
            System.out.print(++i + " ");
            if(i % 10 == 0) {
                System.out.println();
            }
        }

        // 2번 풀이 (이 풀이는 별로인거 같음)
        int j=1;
        while (j<101) {
            System.out.println(j + " " + (j+1)); // ... +9까지 일일이 적어주는거
            j+=10;
        }

        // 내 풀이
        i=1;
        sum=0;
        count=0;
        while (i<101) {
            System.out.print(i + " ");
            i++;
            count++;
            if(count==10) {
                System.out.print("\n");
                count = 0;
            }
        }
    }
}
