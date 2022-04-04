package classWorks;

public class TictacArray {
    public static void main(String[] args) {
        String[][] tic = new String[3][3];
        tic[0][0] = " X ";
        tic[0][1] = " O ";
        tic[0][2] = " X ";
        tic[1][0] = " X ";
        tic[1][1] = " X ";
        tic[1][2] = " X ";
        tic[2][0] = " O ";
        tic[2][1] = " X ";
        tic[2][2] = " O ";

        System.out.println(tic[0][0] + tic[0][1] + tic[0][2]);
        System.out.println(tic[1][0] + tic[1][1] + tic[1][2]);
        System.out.println(tic[2][0] + tic[2][1] + tic[2][2]);

    }
}
