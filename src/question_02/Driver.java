package question_02;

public class Driver {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.insert(2);
        queue.insert(3);
        queue.insert(5);

        queue.insert(4);
        queue.insert(1);
        queue.display();
    }
}
