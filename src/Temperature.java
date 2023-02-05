public class Temperature {
    private double c;
    private double f;

//    private double value = 0d;
//
//    Temperature(double value, char unit) {
//        this.value = value;
//        switch (unit) {
//            case 'C':
//                this.value = value;
//                break;
//            case 'F':
//                this.value = 5.0 / 9 * (value - 32);
//                break;
//        }
//        System.out.println("Температура  = " + value + "°" + unit);
//    }
//
//    double getInC() {
//        return value;
//    }
//
//    double getInF() {
//        return 9.0 / 5 * value + 32;
//    }
    public Temperature(){
        c = 0;
        f = 0;
    }
    public double getC() {
        return (5 * f - 32) / 9;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getF() {
        return (9 * c/5) + 32;
    }

    public void setF(double f) {
        this.f = f;
    }
}
