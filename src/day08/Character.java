package day08;

public class Character {
    Attackable attackStrategy;


    void setAttackStrategy(Attackable strategy) {
        this.attackStrategy = strategy;
    }

    void performAttack() {
        attackStrategy.attack();
    }
}
