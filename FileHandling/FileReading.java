import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) {

        FileReader fileRead=null;
        try {
             fileRead = new FileReader("sample.txt");
            int i;
            while ((i=fileRead.read())!=-1){
                System.out.print((char)i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try{
            fileRead.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
