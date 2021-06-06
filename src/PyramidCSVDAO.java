import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PyramidCSVDAO {
    ArrayList <Pyramid> pyramidList;

    public PyramidCSVDAO() {
    }

    public List<Pyramid> readPyramidsFromCSV(String fileName){
        pyramidList = new ArrayList<Pyramid>();

        // Open the pyramids csv file
        File pyramidsFile = new File(fileName);

        // create new list to store the read lines
        List<String> lines = new ArrayList<>();

        // read all the lines from the csv file to the list
        try{
            lines = Files.readAllLines(pyramidsFile.toPath());
        }catch (Exception e){
            System.out.println("Error Reading File !");
            System.out.println(e.toString());
        }

        // extract data from the list and create pyramid object from each line
        for (int lineIdx = 1; lineIdx < lines.size(); lineIdx++){

            String line = lines.get(lineIdx);

            String[] fields = line.split(",");

            pyramidList.add(createPyramid(fields));
        }
        return pyramidList;
    }

    public Pyramid createPyramid(String[] metadata){
        for (int fieldIdx = 0; fieldIdx < metadata.length; fieldIdx++)
            metadata[fieldIdx] = metadata[fieldIdx].trim();

        return new Pyramid(metadata[0], metadata[2], metadata[4], metadata[9]);
    }

}
