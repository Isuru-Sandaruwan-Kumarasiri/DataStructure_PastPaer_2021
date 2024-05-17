package question_01;

public class Node {
    private String registerNumber;
    private String name;
    private String age;
    private String event;
    private Node next;

    public Node(String registerNumber, String name, String age, String event) {
        this.registerNumber = registerNumber;
        this.name = name;
        this.age = age;
        this.event = event;
        this.next=null;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return
                "registerNumber=" + registerNumber + '\n' +
                " name=" + name + '\n' +
                " age=" + age + '\n' +
                " event=" + event + '\n' ;

    }
}
