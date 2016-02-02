package com.zplcod;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by Clancy on 2016/2/1.
 */
public class FileSourceSample {

    public static final void call() {

        try {

            String path = "F:/MyCode/simpleJ2ee/src/main/resources/file1.txt";
            Resource rest1 = new FileSystemResource(path);

            Resource rest2 = new ClassPathResource("/file1.txt");
            InputStream ins1 = rest1.getInputStream();
            InputStream ins2 = rest2.getInputStream();
            System.out.println("res1 :" + rest1.getFilename());
            System.out.println("res2 :" + rest2.getFilename());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
