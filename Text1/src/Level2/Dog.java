package Level2;

public class Dog extends Animal{
    public Dog() {
        setColoer("五颜六色");
        setFeedWith("狗粮或者家里的饭菜");
        setHabitat("家里");
    }

    @Override
    public void eat() {
        System.out.println("狗吃狗粮");
    }

    @Override
    public void sleep() {
        System.out.println("狗睡觉");
    }
}
