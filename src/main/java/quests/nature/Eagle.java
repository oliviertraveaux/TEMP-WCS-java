package quests.nature;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying) {
        this.flying = flying;
    }


    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && (this.altitude == 0)) {
            this.flying = true;
            System.out.printf("%s takes off in the sky. %n", this.getName());
        } else {
            System.out.printf("%s is already in the air. %n", this.getName());
        }
    }

    @Override
    public void ascend(int meters) {
        if (this.flying) {
            this.altitude += meters;
            System.out.printf("%s flies upward, altitude: %s. %n", this.getName(), this.altitude);
        }
    }

    @Override
    public void glide() {
        if (this.flying && altitude > 0) {
            System.out.printf("%s glides into the air. %n", this.getName());
        } else {
            System.out.printf("%s can't glide on the floor. %n", this.getName());

        }
    }

    @Override
    public void descend(int meters) {
        int newAltitude = this.altitude - meters;
        if (this.flying && (newAltitude > 0)) {
            this.altitude -= meters;
            System.out.printf("%s flies downward, altitude: %s. %n", this.getName(), this.altitude);
        } else if (this.flying && (newAltitude == 0)) {
            System.out.printf("%s lands on the floor. %n", this.getName());
        } else {
            System.out.printf("%s can't descend that low. %n", this.getName());
        }
    }

    @Override
    public void land() {
        if (this.flying && (this.altitude == 1)) {
            System.out.printf("%s lands on the ground. %n", this.getName());
        } else {
            System.out.printf("%s is too high, he can't land %n", this.getName());
        }
    }
}
