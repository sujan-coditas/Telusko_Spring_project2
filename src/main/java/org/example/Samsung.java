package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Samsung {
    @Autowired
            @Qualifier("mediaTec")
    MicroProcessor cpu;


    public MicroProcessor getCpu() {
        return cpu;
    }



    public void setCpu(MicroProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println("this is samsung s7 ");
        cpu.process();
    }

}
