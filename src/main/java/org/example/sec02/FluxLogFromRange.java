package org.example.sec02;

import org.example.utils.Util;
import reactor.core.publisher.Flux;

import static org.example.utils.Util.onNext;

public class FluxLogFromRange {

    public static void main(String[] args) {

        Flux.range(1, 10)
                .log()
                .map(i -> Util.faker().name().fullName())
                .subscribe(onNext());
    }
}
