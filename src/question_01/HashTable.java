package question_01;

public class HashTable {

    LinkedList [] list=new LinkedList[10];

    public int index(String reg){
        String [] array=reg.split("/");
        switch(array[0].toLowerCase()){
            case "s":
                return 0;
            case "med":
                return 1;
            case "a":
                return 2;
            case "mg":
                return 3;
            case "ahs":
                return 4;
            case "vs":
                return 5;
            case "e":
                return 6;
            case "ag":
                return 7;
            case "d":
                return 8;
            default:
                return 9;
        }
    }
    public void addStudents(String registerNumber, String name, String age, String event){
       int index=index(registerNumber);
       if(list[index]==null){
           LinkedList LL=new LinkedList();
           list[index]=LL;
           LL.insertEnd(registerNumber,name,age,event);
       }else{
           list[index].insertEnd(registerNumber,name,age,event);
       }

    }
   public void search(String reg){
       int index=index(reg);
       LinkedList temp=list[index];
       temp.search(reg);
   }
}
