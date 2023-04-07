package org.example.sec02;

import org.example.utils.NameGenerator;
import org.example.utils.Util;

import java.util.List;

public class FluxVsList {

    public static void main(String[] args) {

        NameGenerator.getNamesFlux(5)
                .subscribe(Util.onNext());
    }
}
