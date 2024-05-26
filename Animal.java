public class Animal {
    private String name;
    private boolean hasFur;
    private String skin;
    private boolean call;
    private String noise;

    String getName() {
        return name;
    }

    void setName(String a) {
        this.name = a;
    }

    boolean hasFur() {
        return hasFur;
    }

    void setFur(boolean hasFur) {
        this.hasFur = hasFur;
    }

    String getSkin() {
        return skin;
    }

    void setSkin(String s) {
        this.skin = s;
    }

    boolean getCall() {
        return call;
    }

    void setCall(boolean c) {
        this.call = c;
    }

    void setNoise(String n) {
        this.noise = n;
    }

    String getNoise() {
        return noise;
    }

}
