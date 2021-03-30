// Java program to illustrate reading data from file
// using nio.File
import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
public class ReadFileIntoList
{
    private static List<String> readFileInList()
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get("./test.txt"), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {
        List<String> l = readFileInList();
        int fileHeader;
        int fileEnd;
        int fcHeader = 0;
        int fcEnd = 0;
        int fvHeader = 0;
        int fvEnd = 0;
        int fmHeader = 0;
        int fmEnd = 0;
        int flHeader= 0;
        int flEnd = 0;
        int fsHeader = 0;
        int fsEnd = 0;
        for (String src : l) {
            if(src.substring(0, 2).equals("90")) {
                fileHeader = l.indexOf(src);
                System.out.println(fileHeader);
            }
            if(src.substring(0, 2).equals("91")) {
                fileEnd = l.indexOf(src);
                System.out.println(fileEnd);
            }
            if(src.substring(0, 2).equals("92")) {
                fcHeader = l.indexOf(src);
                System.out.println(fcHeader);
            }
            if(src.substring(0, 2).equals("93")) {
                fcEnd = l.indexOf(src);
                System.out.println(fcEnd);
            }
            if(src.substring(0, 2).equals("94")) {
                fvHeader = l.indexOf(src);
                System.out.println(fvHeader);
            }
            if(src.substring(0, 2).equals("95")) {
                fvEnd = l.indexOf(src);
                System.out.println(fvEnd);
            }
            if(src.substring(0, 2).equals("96")) {
                fmHeader = l.indexOf(src);
                System.out.println(fmHeader);
            }
            if(src.substring(0, 2).equals("97")) {
                fmEnd = l.indexOf(src);
                System.out.println(fmEnd);
            }
            if(src.substring(0, 2).equals("98")) {
                flHeader = l.indexOf(src);
                System.out.println(flHeader);
            }
            if(src.substring(0, 2).equals("99")) {
                flEnd = l.indexOf(src);
                System.out.println(flEnd);
            }
            if(src.substring(0, 2).equals("80")) {
                fsHeader = l.indexOf(src);
                System.out.println(fsHeader);
            }
            if(src.substring(0, 2).equals("81")) {
                fsEnd = l.indexOf(src);
                System.out.println(fsEnd);
            }
        }
        List<String> fcList = l.subList(fcHeader, fcEnd+1);
        FileWriter writerFC = new FileWriter("./Fichier_Commerçant.txt");
        for (String src : fcList){
            writerFC.write(src + System.lineSeparator());
        }
        writerFC.close();

        List<String> fvList = l.subList(fvHeader, fvEnd+1);
        FileWriter writerFV = new FileWriter("./Fichier_Visa.txt");
        for (String src : fvList){
            writerFV.write(src + System.lineSeparator());
        }
        writerFV.close();

        List<String> fmList = l.subList(fmHeader, fmEnd+1);
        FileWriter writerFM = new FileWriter("./Fichier_MasterCard.txt");
        for (String src : fmList){
            writerFM.write(src + System.lineSeparator());
        }
        writerFM.close();

        List<String> flList = l.subList(flHeader, flEnd+1);
        FileWriter writerFL = new FileWriter("./Fichier_Local.txt");
        for (String src : flList){
            writerFL.write(src + System.lineSeparator());
        }
        writerFL.close();

        List<String> fsList = l.subList(fsHeader, fsEnd+1);
        FileWriter writerFS = new FileWriter("./Fichier_SWITCH.txt");
        for (String src : fsList){
            writerFS.write(src + System.lineSeparator());
        }
        writerFS.close();
    }
}
