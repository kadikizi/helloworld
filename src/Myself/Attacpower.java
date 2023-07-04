package Myself;

public class Attacpower {
    public class Soldier extends Private {
        private int attackPower;

        // Constructor
        public Soldier(int attackPower) {
            this.attackPower = attackPower;
        }

        // Getter and Setter for attackPower
        public int getAttackPower() {
            return attackPower;
        }

        public void setAttackPower(int attackPower) {
            this.attackPower = attackPower;
        }
    }

    // Private class (assumed to be defined elsewhere)
    class Private {
        // ... implementation of the Private class
    }

}
