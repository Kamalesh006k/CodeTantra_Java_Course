import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
    public static void main(String[] args) {
        try {
            File file = new File("demo.txt");
            if(file.createNewFile()){
                System.out.println("File created");
            }else{
                System.out.println("File already Created");
            }

            System.out.println("File Name: "+file.getName());
            System.out.println("File path: "+file.getPath());
            System.out.println("File Absolute Path: "+file.getAbsolutePath());
            FileWriter writer = new FileWriter(file);
            writer.write("Im kamalesh from EEE department");
            writer.close();

            FileReader reader = new FileReader(file);
            int ch;
            while((ch = reader.read())!= -1){
                System.out.print((char) ch);
            }

        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
