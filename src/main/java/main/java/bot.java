package main.java;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import java.util.Scanner;

public class bot extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NjA3NTI2NTUxOTQ0Mjk4NDk3.XUa61A.g1YQ3lEpOdqmlwGsCtxvcFPqgEw";
        builder.setToken(token);
        builder.addEventListener(new bot());
        builder.buildAsync();
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.println("Message from " + event.getAuthor().getName() + ": " + event.getMessage().getContentDisplay());

        Scanner sc = new Scanner(System.in);

        if (event.getMessage().getContentRaw().equals("!ping")) {
            event.getChannel().sendMessage("Pong motherfucker").queue();
        }
    }
}
