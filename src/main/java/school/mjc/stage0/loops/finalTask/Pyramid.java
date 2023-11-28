package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int center = cathetusLength-1;
        for (int i = 0; i < cathetusLength; i++) {
            int k = i+1;
            for (int j = 0; j < cathetusLength*2; j++) {
                if(i<=center) {
                    if(j>=center-i&&j<=center+i){
                        System.out.print(k);
                        if(j<center){
                            k--;
                        }else{
                            k++;
                        }
                    }else if(j<center-i){
                        System.out.print(" ");
                    }
                }
            }
                System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(9);
    }
}
