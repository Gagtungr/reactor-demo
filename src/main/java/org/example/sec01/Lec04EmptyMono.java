package org.example.sec01;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

public class Lec04EmptyMono {

    public static void main(String[] args) {

        userRepo(3)
                .subscribe(Util.onNext(), Util.onError(), Util.onComplete());
    }

    private static Mono<String> userRepo(int id) {
        if (id == 1) {
            return Mono.just(Util.faker().name().fullName());
        }
        else if (id == 2) {
            return Mono.empty();
        } else
            return Mono.error(new RuntimeException("Out of range"));
    }
}
