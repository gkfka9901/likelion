package day08;

public class AttackMain {
    public static void main(String[] args) {
        Character character = new Character();
        character.setAttackStrategy(new SwordAttack());
        character.performAttack();

        character.setAttackStrategy(new BowAttack());
        character.performAttack();
    }

}
