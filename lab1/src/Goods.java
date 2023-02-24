import java.io.BufferedReader;
import java.io.IOException;


public class Goods {
    private String name;
    private String info;
    private int price;
    private int value;
    private int number;

    public Goods() {
        name = "None";
        info = "None";
        price = 0;
        value = 0;
        number = 0;
    }

    public Goods(Goods object) {
        name = object.name;
        info = object.info;
        price = object.price;
        value = object.value;
        number = object.number;
    }

    public Goods clone() {
        return new Goods(this);
    }

    public boolean equal(Goods object) {
        return (name.equals(object.name) &&
                info.equals(object.info) &&
                price == object.price &&
                value == object.value &&
                number == object.number);
    }

    public void readingFile(BufferedReader reader) throws
            IOException {
        String line = reader.readLine();
        String[] fields = line.split(",");

        name = fields[0];
        info = fields[1];
        price = Integer.parseInt(fields[2]);
        value = Integer.parseInt(fields[3]);
        number = Integer.parseInt(fields[4]);
    }
    public void writeElement(){
        System.out.println(
                name +","+
                info + ","+
                price + ","+
                value + ","+
                number);
    }
}
