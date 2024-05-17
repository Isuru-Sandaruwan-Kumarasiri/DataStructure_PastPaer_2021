package question_02;

public class Queue {
    private Node front;
    private Node rear;

    public void display(){
        Node temp=this.front;
        while(temp!=null){
            System.out.print("->"+temp.getData());
            temp=temp.getNext();
        }
    }
    public void insert(int data){
        Node newNode=new Node(data);
        Node temp=this.front;
        Node pre_node=null;
        if(this.front==null){
            this.front=this.rear=newNode;
            return;
        }else {
            while(temp!=null){
                 if(newNode.getData()<=temp.getData()){
                     if(temp==this.front){
                         newNode.setNext(this.front);
                         this.front=newNode;
                         return;
                     }else{
                         pre_node.setNext(newNode);
                         newNode.setNext(temp);
                         return;
                     }
                 }
                 pre_node=temp;
                temp=temp.getNext();
            }
        }
        this.rear.setNext(newNode);
        this.rear=newNode;
    }
}
