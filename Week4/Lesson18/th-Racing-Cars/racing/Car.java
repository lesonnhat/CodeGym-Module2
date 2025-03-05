package racing;

import java.util.Random;
import static racing.Main.DISTANCE;
import static racing.Main.STEP;


public class Car implements Runnable {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is running");

        // Khởi tạo điểm start (km ban đầu)
        int runDistance = 0;

        // Khởi tạo time bắt đầu
        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc
        while (runDistance < Main.DISTANCE) {
            try {
                // Random tốc độ km/h
                int speed = 1 + new Random().nextInt(20); // Tốc độ tối thiểu là 1 km/h

                // Tính toàn khoảng cách đã đi được
                runDistance += speed;

                // Vẽ đường đã đi của xe
                String log = "|";

                int percentTravel = (runDistance * 100) / Main.DISTANCE;
                for (int i = 0; i < Main.DISTANCE; i += Main.STEP) {
                    if (percentTravel >= i + Main.STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + Main.STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("racing.Car " + this.name + ": " + log + " " + Math.min(Main.DISTANCE, runDistance) + "km");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("racing.Car " + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("racing.Car " + this.name + " Finish in: " + (endTime - startTime) / 1000 + "s");
    }
}
