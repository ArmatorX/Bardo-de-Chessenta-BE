package com.ArmatorX.BardodeChessentaBE;

import javax.security.auth.login.LoginException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ArmatorX.BardodeChessentaBE.bot.MusicBot;

import net.dv8tion.jda.api.exceptions.RateLimitedException;

@SpringBootApplication
public class BardoDeChessentaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BardoDeChessentaApplication.class, args);
	}

}
