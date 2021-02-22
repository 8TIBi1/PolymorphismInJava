package Polymorphism.Zoo5;

import java.util.Vector;

public class Zoo {

    public static void main(String[] args) {
        Feeder feeder = new Feeder("小李");
        Vector<Animal> ans = new Vector<>();

        //饲养员小李喂养一只狮子
        ans.add(new Lion());
        //饲养员小李喂养十只猴子
        for(int i = 0; i < 10; i++) {
            ans.add(new Monkey());
        }
        //饲养员小李喂养5只鸽子
        for(int i = 0; i < 5; i++) {
            ans.add(new Pigeon());
        }

        feeder.FeedAnimals(ans);
    }

}

class Feeder{

    public String name;
    public Feeder(String name) {
        this.name = name;
    }

    public void FeedAnimals(Vector<Animal> animals) {
        for(Animal animal : animals) {
            animal.FeedAnimal();
        }
    }
}

abstract class Animal implements Eat, Feed{

}

class Lion extends Animal {

    public void AnimalEat() {
        System.out.println("我不吃肉谁敢吃肉！");
    }

    @Override
    public void FeedAnimal() {
        this.AnimalEat();
    }
}

class Monkey extends Animal {

    public void AnimalEat() {
        System.out.println("我什么都吃，尤其喜欢香蕉。");
    }

    @Override
    public void FeedAnimal() {
        this.AnimalEat();
    }
}

class Pigeon extends Animal {

    public void AnimalEat() {
        System.out.println("我要减肥，所以每天只吃一点大米。");
    }

    @Override
    public void FeedAnimal() {
        this.AnimalEat();
    }
}


