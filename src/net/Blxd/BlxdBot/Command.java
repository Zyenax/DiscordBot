package net.Blxd.BlxdBot;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by Anthony on 11/5/2016.
 */
public interface Command {

    public boolean called(String[] args, MessageReceivedEvent event);
    public void action(String[] args, MessageReceivedEvent event);
    public String help();
    public void executed(boolean success, MessageReceivedEvent event);




}
