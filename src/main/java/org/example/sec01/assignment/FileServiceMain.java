package org.example.sec01.assignment;

import static org.example.utils.Util.*;

public class FileServiceMain {

    public static void main(String[] args) {

        FileService.read("file3.txt")
                .subscribe(onNext(), onError(), onComplete());

        FileService.write("file3.txt", "This is file 3")
                .subscribe(onNext(), onError(), onComplete());
    }
}
