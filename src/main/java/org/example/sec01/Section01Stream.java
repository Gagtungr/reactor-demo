package org.example.sec01;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

import java.util.stream.Stream;

public class Section01Stream {

    public static void main(String[] args) {

        Mono<String> mono = Mono.just("ball");


        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );

    }
}
