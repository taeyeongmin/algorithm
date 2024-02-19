package proxy2;

public class Cat implements Interface2 {

    private String sound;

    public Cat(String sound) {
        this.sound = sound;
    }
    @Override
    public void action(String param) {
        System.out.println(param+":"+sound);
    }
}
