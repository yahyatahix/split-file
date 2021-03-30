import java.util.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.io.*;
public class LisDivider
{
    private static List<String> readFileInList(String fileName)
    {
        List<String> lines = Collections.emptyList();
        try
        {
            lines = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return lines;
    }
    public static void main(String[] args) throws IOException {
        List<String> l = readFileInList(args[0]);
        int fileHeader, fileEnd, fcHeader, fcEnd, fvHeader, fvEnd, fmHeader, fmEnd, flHeader, flEnd, fsHeader, fsEnd;
        fileHeader = fileEnd = fcHeader = fcEnd = fvHeader = fvEnd = fmHeader = fmEnd = flHeader = flEnd = fsHeader = fsEnd = -0;
        for (String src : l) {
            if(src.substring(0, 2).equals("90")) {
                fileHeader = l.indexOf(src);
                System.out.println("Entête de fichier");
            }
            if(src.substring(0, 2).equals("91")) {
                fileEnd = l.indexOf(src);
                System.out.println("Fin de fichier");
            }
            if(src.substring(0, 2).equals("92")) {
                fcHeader = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("93")) {
                fcEnd = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("94")) {
                fvHeader = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("95")) {
                fvEnd = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("96")) {
                fmHeader = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("97")) {
                fmEnd = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("98")) {
                flHeader = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("99")) {
                flEnd = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("80")) {
                fsHeader = l.indexOf(src);
            }
            if(src.substring(0, 2).equals("81")) {
                fsEnd = l.indexOf(src);
            }
        }

        if(fcHeader != 0){
            List<String> fcList = l.subList(fcHeader, fcEnd+1);
            FileWriter writerFC = new FileWriter("./Fichier_Commerçant_java.txt");
            for (String src : fcList){
                writerFC.write(src + System.lineSeparator());
            }
            writerFC.close();
        }

        if(fvHeader != 0){
            List<String> fvList = l.subList(fvHeader, fvEnd+1);
            FileWriter writerFV = new FileWriter("./Fichier_Visa_java.txt");
            for (String src : fvList){
                writerFV.write(src + System.lineSeparator());
            }
            writerFV.close();
        }

        if(fmHeader != 0){
            List<String> fmList = l.subList(fmHeader, fmEnd+1);
            FileWriter writerFM = new FileWriter("./Fichier_MasterCard_java.txt");
            for (String src : fmList){
                writerFM.write(src + System.lineSeparator());
            }
            writerFM.close();
        }

        if(flHeader != 0 ){
            List<String> flList = l.subList(flHeader, flEnd+1);
            FileWriter writerFL = new FileWriter("./Fichier_Local_java.txt");
            for (String src : flList){
                writerFL.write(src + System.lineSeparator());
            }
            writerFL.close();
        }

        if(fsHeader != 0 ){
            List<String> fsList = l.subList(fsHeader, fsEnd+1);
            FileWriter writerFS = new FileWriter("./Fichier_SWITCH_java.txt");
            for (String src : fsList){
                writerFS.write(src + System.lineSeparator());
            }
            writerFS.close();
        }
    }
}
