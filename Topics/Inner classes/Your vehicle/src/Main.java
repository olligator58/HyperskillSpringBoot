class EnjoyVehicle {

    public static void startVehicle() {
        new EnjoyVehicle().new Engine().start();
    }

    class Engine {

        void start() {
            System.out.println("RRRrrrrrrr....");
        }
    }
}

class Testus {
    public static void main(String[] args) {
        EnjoyVehicle.startVehicle();
    }
}