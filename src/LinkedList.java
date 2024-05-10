public class LinkedList {
      private  Node head;
      private Node tail;

    public LinkedList(Node head, Node tail) {
        this.head = this.tail = null;
    }
    public void  insertFront(String registerNumber, String name, String age, String event){
        Node newNode=new Node(registerNumber,name,age,event);
        if(this.head==null){
            this.head=this.tail=newNode;
        }else{
            newNode.setNext(this.head);
            this.head=newNode;
        }
    }
    public void  insertEnd(String registerNumber, String name, String age, String event){
        Node newNode=new Node(registerNumber,name,age,event);
        if(this.head==null){
            this.head=this.tail=newNode;
        }else{
           tail.setNext(newNode);
           this.tail=newNode;
        }
    }
    public boolean isEmpty(String reg){
        Node temp=this.head;
        while(temp!=null){
            if(temp.getRegisterNumber()==reg){
                return true;
            }
            temp=temp.getNext();
        }
        return false;
    }
    public  void search(String reg){
        Node temp=this.head;
        while(temp!=null){
            if(temp.getRegisterNumber()==reg){
                System.out.println("Student Found \n--------------------------");
                System.out.println(temp);
                return;
            }
            temp=temp.getNext();
        }
        System.out.println("Not Found");

    }
    public void delete(String reg){
        Node temp=this.head;
        while(temp!=null){
            if(temp.getNext().getRegisterNumber()==reg){
                Node afterNode=temp.getNext().getNext();
                Node targetNode=temp.getNext();

                temp.setNext(afterNode);
                targetNode.setNext(null);

            }
            temp=temp.getNext();
        }
    }
    public void display(){
        Node temp=this.head;
        while(temp!=null){
            System.out.println(temp);
            temp=temp.getNext();
        }
    }
}
