

public class Dog {

    private final String TAG="\nDog ";

    private int size;
    private String name;

    public void setSize(int s) { size = s; }
    public int getSize() { return size; }

    public void setName(String n) { name = n; }
    public String getName() { return name; }

    public Dog() {
        System.out.println(TAG + "Constructor");
    
        size = 0;
        name = null;
    }

    void bark() {
        if (size >= 5) {
            System.out.println("WOW WOW");
        } else {
            System.out.println("wow wow");
        }
    }

    void info() {
        System.out.println("size: " + size
                        +  "\nname: " + name);
    }
}