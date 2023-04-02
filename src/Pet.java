import javax.swing.*;

public abstract class Pet implements DomesticAnimal {

    protected int age;
    protected String breed;
    protected Owner owner;

    public Pet(String b,int a) {breed=b; age=a;}
    public int getAge(){return age;}
    public String getbreed(){return breed;}
    public void birthday(){age++;
        JOptionPane.showMessageDialog(null,"Happy"+age+"Year Old Birthday");
    }
    public abstract void adoptionCompleted();
    public void setOwner(Owner o){ owner=o;}
    public String getOwnerName(){return owner.getName();}



}
