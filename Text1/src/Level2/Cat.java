package Level2;

public class Cat extends Animal{
    public Cat() {
        setHabitat("家里");
        setColoer("五颜六色");
        setFeedWith("杂食");
    }

    @Override
    public void eat() {
        System.out.println("猫吃猫粮");
    }

    @Override
    public void sleep() {
        System.out.println("猫睡觉");
    }
}
