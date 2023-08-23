public class Main {
    public static void main(String[] args) {
        Magic magic = new Magic();
        Medic medic = new Medic();
        Warrior warrior = new Warrior();

        Hero[] myHeroes = {magic, medic, warrior};
        for (int i = 0; i < myHeroes.length; i++) {
            myHeroes[i].applySuperAbility();
            if (myHeroes[i] instanceof Medic) {
                ((Medic) myHeroes[i]).increaseExpirience(); //type casting
            }
        }
    }

}

