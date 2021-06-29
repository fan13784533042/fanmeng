import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Test  {



        public static void main(String[] args) {
           Test demo = new Test();
            try {
                demo.copyFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public void copyFile() throws IOException {
            FileInputStream fis = new FileInputStream("d://源文件.txt");
            FileOutputStream fos = new FileOutputStream("f:/目标文件.txt");
            int b = 0;
            while ((b = fis.read()) != -1) {
                fos.write(b);
                fis.close();
                fos.close();
            }
        }



}
