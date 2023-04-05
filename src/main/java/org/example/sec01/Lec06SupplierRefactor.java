package org.example.sec01;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

public class Lec06SupplierRefactor {

    public static void main(String[] args) {

        getName().subscribe(Util.onNext());
        getName().subscribe(Util.onNext());
        getName().subscribe(Util.onNext());
        getName().subscribe(Util.onNext());


    }

    private static Mono<String> getName() {
        System.out.println("Preparing for name generation.....");

        return Mono.fromSupplier(() -> {
            System.out.println("Generating name ...");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);
    }
}
