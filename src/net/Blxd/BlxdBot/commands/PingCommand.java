package net.Blxd.BlxdBot.commands;

import net.Blxd.BlxdBot.Command;
import net.dv8tion.jda.events.message.MessageReceivedEvent;

/**
 * Created by Anthony on 11/5/2016.
 */
public class PingCommand implements Command {

    private final String HELP = "USAGE: ~!ping";

    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return true;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {
        event.getTextChannel().sendMessage("PONG");
    }

    @Override
    public String help() {
        return HELP;
    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {
        return;
    }
}
