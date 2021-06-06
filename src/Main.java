import java.util.List;

public class Main {
    public static void main(String[] args){
        PyramidCSVDAO pDAO = new PyramidCSVDAO();

        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\omarh\\IdeaProjects\\PyramidsData\\src\\pyramids.csv");

        int i = 1;

        for (Pyramid p : pyramids){
            System.out.println("#" + i++ + p);
        }
    }
}
