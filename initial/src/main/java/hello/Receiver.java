package hello;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Receiver {

    private final CountDownLatch latch;

    public Receiver() {
        this.latch = new CountDownLatch(1);
    }

    public void receiveMessage(String message) {

        System.out.println("Recieved <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
