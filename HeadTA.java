// I (Maxim Vancompernolle) worked on the homework assignment alone, using only course materials.
public class HeadTA {
    public static void giveCollabStatement(StoneType[] stones, int rows, int cols) {
        boolean flag = false;
        for (int i = 0; i < stones.length; i++) {
            if (stones[i] == StoneType.GRADING) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Snaps Fingers");
            boolean[][] collabStatementArray = new boolean[rows][cols];
            for (int i = 0; i < collabStatementArray.length; i++) {
                for (int j = 0; j < collabStatementArray[i].length; j++) {
                    if (j < (collabStatementArray[i].length - 1)) {
                        if ((i > 0) && !(collabStatementArray[i - 1][collabStatementArray[i].length - 1])) {
                            collabStatementArray[i][j] = true;
                            j++;
                        } else {
                            collabStatementArray[i][j + 1] = true;
                            j++;
                        }
                    } else if (j == collabStatementArray[i].length - 1) {
                        if (!collabStatementArray[i][collabStatementArray[i].length - 2]) {
                            collabStatementArray[i][j] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < collabStatementArray.length; i++) {
                for (int j = 0; j < collabStatementArray[i].length; j++) {
                    if (collabStatementArray[i][j]) {
                        System.out.print("T");
                    } else {
                        System.out.print("F");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Cannot Grade");
        }
    }
    public static void main(String[] args) {
        StoneType[] myStones = new StoneType[4];
        myStones[0] = StoneType.SHINY;
        myStones[1] = StoneType.SMALL;
        myStones[2] = StoneType.BIG;
        myStones[3] = StoneType.GRADING;
        giveCollabStatement(myStones, 3, 4);
        StoneType[] noStones = new StoneType[0];
        giveCollabStatement(noStones, 5, 5);
    }
}