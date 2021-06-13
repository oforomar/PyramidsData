import java.util.List;

public class Main {
    public static void main(String[] args){
        // Create pyramid list form csv
        PyramidCSVDAO pDAO = new PyramidCSVDAO();
        List<Pyramid> pyramids = pDAO.readPyramidsFromCSV("C:\\Users\\omarh\\IdeaProjects\\PyramidsData\\src\\pyramids.csv");

        // Print all pyramids
        int i = 1;
        for (Pyramid p : pyramids){
            System.out.println("#" + i++ + p);
        }

        // Sort the heights and store the sorted stream
        long size = pyramids.size();

        // Find the median of pyramid heights
        System.out.println("The median pyramid height is: " +
                pyramids.stream()
                        .mapToDouble(Pyramid::getHeight)
                        .sorted()
                        .skip(size/2 - 1)
                        .limit(2-size%2)
                        .average().orElse(Double.NaN));

        // Find the average
        System.out.println("The average pyramid height is: " +
                pyramids.stream()
                        .mapToDouble(Pyramid::getHeight)
                        .average().orElse(Double.NaN));

        // Find the lower quartile
        System.out.println("The first quartile height is: " +
                pyramids.stream()
                          .mapToDouble(Pyramid::getHeight)
                          .skip(size/4 -1)
                          .limit(2-size%2)
                          .average().orElse(Double.NaN));

        // Find the third quartile
        System.out.println("The third quartile height is: " +
                pyramids.stream()
                        .mapToDouble(Pyramid::getHeight)
                        .skip((size*3)/4 -1)
                        .limit(2-size%2)
                        .average().orElse(Double.NaN));
    }
}
