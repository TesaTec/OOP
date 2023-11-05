package Part3.Modul3_3.Øvelse1_CSVFiler;

public class Main {
    public static void main(String[] args) {
        String s1_filename ="C:\\Users\\magnu\\Desktop\\Coding\\OOP\\OOP_exercises\\src\\Part3\\Modul3_3\\Øvelse1_CSVFiler\\save1.csv";
        String s2_filename ="C:\\Users\\magnu\\Desktop\\Coding\\OOP\\OOP_exercises\\src\\Part3\\Modul3_3\\Øvelse1_CSVFiler\\save2.csv";

        Matrix m1 = new Matrix(4,6);
        m1.save(s1_filename);

        Matrix m2 = new Matrix(s1_filename);

        for(int i = 0; i < m2.getHeight(); i++) {
            for(int j = 0; j < m2.getWidth(); j++) {
                if(j == i) {
                    m2.setValue(i,i, m1.getValue(i,i)+1);
                }
            }
        }
        m2.save(s2_filename);
    }
}
