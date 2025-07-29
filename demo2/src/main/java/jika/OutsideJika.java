package jika;

import org.springframework.stereotype.Component;

@Component
public class OutsideJika {
    public String printMessage() {
        System.out.println("Hello from outside");
    }
}
