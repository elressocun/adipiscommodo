import java.util.List;

public class MyClass {
    private List<String> list;

    // Constructor
    public MyClass(List<String> list) {
        // Assign the parameter 'list' to the instance variable 'list'
        this.list = list;
    }

    // Getter for the list
    public List<String> getList() {
        return list;
    }

    // Setter for the list
    public void setList(List<String> list) {
        this.list = list;
    }
    
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Hello");
        myList.add("World");

        MyClass myClassInstance = new MyClass(myList);
        
        System.out.println("List contents: " + myClassInstance.getList());
    }
}
