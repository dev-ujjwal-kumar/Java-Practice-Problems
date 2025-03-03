public class TrafficLightSimulation {
    public static void main(String[] args){
        TrafficLight trafficLight = new TrafficLight();
        Thread trafficLightThread = new Thread(trafficLight);
        trafficLightThread.start();
    }}

//    OP
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO
//        RED: STOP
//        YELLOW: READY
//        GREEN: GO (will print till system terminate)