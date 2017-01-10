package net.Blxd.BlxdBot;

import net.dv8tion.jda.events.ReadyEvent;
import net.dv8tion.jda.events.message.MessageReceivedEvent;
import net.dv8tion.jda.hooks.ListenerAdapter;

/**
 * Created by Anthony on 11/5/2016.
 */
public class BotListener extends ListenerAdapter{

    public void onMessageRecieved(MessageReceivedEvent event){
        if(event.getMessage().getContent().startsWith("~!") && event.getMessage().getAuthor().getId() != event.getJDA().getSelfInfo().getId()) Main.handleCommand(Main.parser.parse(event.getMessage().getContent().toLowerCase(), event));
    }

    @Override
    public void onReady(ReadyEvent event){
       // Main.log("status", "Logged in as " + event.getJDA().getSelfInfo().getUsername());
    }

}
