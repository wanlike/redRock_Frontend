package Level2;

public class Pig extends Animal{
    public Pig() {
        setColoer("白色");
        setFeedWith("饲料");
        setHabitat("猪圈");
    }

    @Override
    public void eat() {
        System.out.println("猪吃饲料");
    }

    @Override
    public void sleep() {
        System.out.println("猪睡觉");
    }
}
