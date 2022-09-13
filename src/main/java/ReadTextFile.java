import java.io.*;

public class ReadTextFile {
    public static void main(String[] arg) throws IOException {
        String path = System.getProperty("user.dir")+ File.separator+"Test.txt";
        FileInputStream fs = new FileInputStream(path);
        BufferedReader bf = new BufferedReader(new InputStreamReader(fs));
        //String l1 = bf.readLine();
        //System.out.println(l1);
       // for(int i=1;i<=3;i++){
          //  System.out.println(bf.readLine());
      //  }
        String x = "";
        while ((x= bf.readLine())!=null){
            System.out.println(x);
        }
    }
}
