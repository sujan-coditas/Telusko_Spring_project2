package org.example;

import org.springframework.stereotype.Component;

@Component("mediaTec")
public class MediaTec implements MicroProcessor{
    @Override
    public void process() {
        System.out.println("This is media Tec ");
    }
}
