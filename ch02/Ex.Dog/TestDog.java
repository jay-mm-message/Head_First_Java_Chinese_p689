public class TestDog {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
    
        dog.setName("ellen");
        dog.setSize(5);
        dog.info();
        dog.bark();

        Dog dog2 = new Dog();
        dog2.setName("jay");
        dog2.setSize(2);
        dog2.info();
        dog2.bark();
    }
}
