public class Medic extends Hero implements HavingSuperAbility {
    private double healPoints = 10.0;

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Medic применил суперспособность ULTRA HEAL");

    }

    public double getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(double healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExpirience() {
        for (int i = 0; i < healPoints; i+=1.0) {
            System.out.println("Количество единиц лечения героя Medic увеличилось на " + i);

        }
    }


}

