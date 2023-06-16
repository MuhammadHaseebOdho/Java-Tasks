import java.io.FileWriter;

public class FileWrite{
    public static void main(String[] args) {
        FileWriter newfile=null;
        try{
            newfile=new FileWriter("Sample.txt");
            newfile.write("Name   Age\n");
            newfile.write("Haseeb  21\n");
            newfile.write("Touqeer 20\n");
            newfile.write("Izhar   22\n");
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
                newfile.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
