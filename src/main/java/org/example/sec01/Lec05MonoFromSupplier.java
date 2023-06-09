package org.example.sec01;

import org.example.utils.Util;
import org.w3c.dom.ls.LSOutput;
import reactor.core.publisher.Mono;

public class Lec05MonoFromSupplier {

    public static void main(String[] args) {

        //WRONG
        //Mono<String> mono = Mono.just(getName());

        Mono<String> mono = Mono.fromSupplier(() -> getName());

        mono.subscribe(Util.onNext());

    }

    private static String getName() {
        System.out.println("Generating name ...");
        return Util.faker().name().fullName();
    }
}
