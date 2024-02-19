package proxy2;

public class Dog implements Interface2{

    private String sound;
    public Dog(String sound) {
        this.sound = sound;
    }

    @Override
    public void action(String param) {
        System.out.println(param+":"+sound);
    }
}
