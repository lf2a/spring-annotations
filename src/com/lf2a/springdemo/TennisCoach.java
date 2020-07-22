package com.lf2a.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // registrando o bean com o id "thatSillyCoach"
// se o id nao for fornecido, o id do bean será o nome da classe com a primeira letra minuscula, ou seja, "tennisCoach"
public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
