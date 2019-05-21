package com.mant.is.autowireactivity;

import com.mant.is.dao.FortuneService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class CoolFortuneService implements FortuneService {

    private List<String> fortunesList;
    private Random random = new Random();

    @PostConstruct
    public void readFileValues() {
        try {
            fortunesList = new ArrayList<>();
            File file = new File("C:\\Users\\Kashif Alei\\IdeaProjects\\Spring Practice\\src\\main\\resources\\fortunes.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null)
                fortunesList.add(st);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        return fortunesList.get(random.nextInt(fortunesList.size()));
    }
}
