package world_of_titan;

import java.util.Random;

public class Titan implements Comparable<Titan> {

    private int index, risk, legs, speed, pattern, climbing, type, height;

    public Titan(int index) {
        this.index = index;
        TitanRisk(index);
    }

    public int getRisk() {
        return risk;
    }

    public int getIndex() {
        return index;
    }

    public int getLegs() {
        return legs;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPattern() {
        return pattern;
    }

    public int getClimbing() {
        return climbing;
    }

    public int getHeight() {
        return height;
    }

    public int getType() {
        return type;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setRisk(int risk) {
        this.risk = risk;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPattern(int pattern) {
        this.pattern = pattern;
    }

    public void setClimbing(int climbing) {
        this.climbing = climbing;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void TitanRisk(int index) {
        Random titan = new Random();

        //generate a random number(0-9)
        //0-5 = normal type titan
        //6-8 = abnormal titan
        //9 = ONE OF THE NINE TITANS
        type = titan.nextInt(10);

        if (type < 6) {
            setHeight(titan.nextInt(25 - 5) + 5);

            Integer[] arraylegs = {0, 2, 4};
            legs = arraylegs[titan.nextInt(3)];

            setSpeed(titan.nextInt(25 - 5) + 5);

            setPattern(titan.nextInt(3));
            String patternstr = "";

            setClimbing(titan.nextInt(2));
            String climbingstr = "";

            Integer[] dangerrisk = new Integer[5];

            if (height > 20) {
                dangerrisk[0] = 3;
            } else if (height > 10) {
                dangerrisk[0] = 2;
            } else {
                dangerrisk[0] = 1;
            }

            if (legs == 4) {
                dangerrisk[1] = 3;
            } else if (legs == 2) {
                dangerrisk[1] = 2;
            } else {
                dangerrisk[1] = 1;
            }

            if (speed > 20) {
                dangerrisk[2] = 3;
            } else if (speed > 10) {
                dangerrisk[2] = 2;
            } else {
                dangerrisk[2] = 1;
            }

            if (pattern == 2) {
                dangerrisk[3] = 3;
                patternstr = "Not repeated pattern";
            } else if (pattern == 1) {
                dangerrisk[3] = 2;
                patternstr = "Repeated pattern";
            } else {
                dangerrisk[3] = 1;
                patternstr = "Normal pattern";
            }

            if (climbing == 1) {
                dangerrisk[4] = 3;
                climbingstr = "Can climb";
            } else {
                dangerrisk[4] = 1;
                climbingstr = "Cannot climb";
            }

            int risk = 0; //set the initial risk = 0
            for (int i = 0; i < dangerrisk.length; i++) {
                risk += dangerrisk[i];
            }

            this.risk = risk;
            System.out.println("Titan " + index + ": Normal Titan (" + height + "m, " + legs + " legs, " + speed + "ms, " + patternstr + ", " + climbingstr + ") Risk=" + risk);
        } else if (type < 9) {
            risk = 15;
            System.out.println("Titan " + index + ": Abnormal Titan Risk=" + risk);
        } else if (type < 10) {
            risk = 19;
            System.out.println("Titan " + index + ": ONE OF THE NINE TITANS Risk=" + risk);
        }
    }

    @Override
    public int compareTo(Titan temp) {
        if (this.getRisk() > temp.getRisk()) {
            return -1;
        } else if (this.getRisk() == temp.getRisk()) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        String p = "";
        String c = "";
        String t = "";
        if (getType() < 6) {
            t = "Normal Titan";

            switch (getPattern()) {
                case 1:
                    p = "normal pattern";
                    break;
                case 2:
                    p = "repeated pattern";
                    break;
                default:
                    p = "repeated pattern";
                    break;
            }

            if (getClimbing() == 3) {
                c = "can climb";
            } else {
                c = "cannot climb";
            }
            return "Titan " + getIndex() + ": " + t + " (" + getHeight() + "m, " + getLegs() + " legs, " + getSpeed() + "ms, " + p + ", " + c + ") Risk=" + risk;
        } else if (getType() < 9) {
            t = "Abnormal Titan";
            return "Titan " + getIndex() + ": " + t + " Risk=" + getRisk();
        } else {
            t = "ONE OF THE NINE TITANS";
            return "Titan " + getIndex() + ": " + t + " Risk=" + getRisk();
        }
    }

}
