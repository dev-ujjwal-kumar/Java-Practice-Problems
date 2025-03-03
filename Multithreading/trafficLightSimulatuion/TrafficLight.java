import java.sql.SQLOutput;

public class TrafficLight implements Runnable{
    private String trafficLight = "RED";

    @Override
    public void run(){
        while(true){
            try{
                switch (trafficLight){
                    case "RED":
                        System.out.println("RED: STOP");
                        Thread.sleep(5000);
                        trafficLight = "YELLOW";
                        break;
                    case "YELLOW":
                        System.out.println("YELLOW: READY");
                        Thread.sleep(5000);
                        trafficLight = "GREEN";
                        break;
                    case "GREEN":
                        System.out.println("GREEN: GO");
                        Thread.sleep(5000);
                        trafficLight = "RED";
                        break;
                }

            }catch (InterruptedException e){
                System.out.println("Traffic light interrupted");
                return;
            }
        }
    }
}
