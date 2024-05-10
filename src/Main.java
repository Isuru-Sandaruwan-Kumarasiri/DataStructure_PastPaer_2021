// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       HashTable table =new HashTable();
       table.addStudents("S/20/426","isuru","23","karate");
        table.addStudents("MG/20/426","isuru","25","karate");
        table.addStudents("MED/20/426","isuru","43","vollyball");
        table.search("S/20/426");
    }
}