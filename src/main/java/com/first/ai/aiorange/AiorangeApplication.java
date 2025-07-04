package com.first.ai.aiorange;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class AiorangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(AiorangeApplication.class, args);
	}

//	@Bean
//	//CommandLineRunner cli(ChatClient.Builder builder){
//	CommandLineRunner cli(@Qualifier("openAiChatClient") ChatClient openAiChatClient){
//		return args -> {
//			var scanner = new Scanner(System.in);
//			ChatClient chat = openAiChatClient;
//			//var chat = builder.build();
//			System.out.println("Using OpenAI model");
//			System.out.print("\nEnter your question: ");
//			//while(scanner.hasNext()){
//				String input = scanner.nextLine();
//				String response = chat.prompt(input).call().content();
//				System.out.println("ASSISTANT: " + response);
//			//}
//			scanner.close();
//		};
//	}
}
