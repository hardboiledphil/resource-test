package org.acme;

import io.quarkus.runtime.QuarkusApplication;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Resources implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("subfolder/SampleFile.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        return 0;
    }
}
