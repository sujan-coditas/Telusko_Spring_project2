package org.example;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MicroProcessor{
    @Override
    public void process() {
        System.out.println("World's best processor");
    }


}
