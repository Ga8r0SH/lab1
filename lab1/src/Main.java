import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Goods[] tovar = new Goods[50];

        try{
            FileReader file = new FileReader("C:\\Users\\gavro\\Desktop\\lab1struct\\lab1\\src\\document.txt");
            BufferedReader buffer = new BufferedReader(file);
            for(int i = 0 ; i < tovar.length; i++ ){
                tovar[i] = new Goods();
                tovar[i].readingFile(buffer);
            }
            for(int i = 0; i<tovar.length;i++){
                tovar[i].writeElement();
            }
        }
        catch (IOException e){
            System.out.println("Error:" + e.getMessage());
        }
    }
}