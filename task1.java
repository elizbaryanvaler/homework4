public class task1 {
    public static void main(String[] args) {
        String[][] simvol = {{"*"},
                            {"* *"},
                            {"* * *"},
                            {"* * * *"}};
        for (int i = 0;i < simvol.length;i++){
            for (int j = 0;j < simvol[i].length;j++){
                System.out.println(simvol[i][j]);
            }
            System.out.println();
        }

    }
}
