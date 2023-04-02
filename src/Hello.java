import javax.swing.*;

public class Hello
{
    public static void main (String [] args)
    {
        Owner owner1=new Owner("Jack");
        Dog d1=new Dog("Max","Golden",5);
        d1.setOwner(owner1);
        d1.adoptionCompleted();
        d1.eat("Dog biscuits");
        d1.sleep(5);
        d1.birthday();
        d1.move("Home","Park");
    }
}
