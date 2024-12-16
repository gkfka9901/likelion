package day08;

public class ReadWriteUser {
    public static void main(String[] args) {
        ReadWritable readWritable = new FileHandler();
        readWritable.writeContent("냠냠");
        System.out.println(readWritable.readContent());
    }

}
