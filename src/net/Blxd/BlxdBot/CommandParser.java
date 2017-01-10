package net.Blxd.BlxdBot;

import net.dv8tion.jda.events.message.MessageReceivedEvent;

import java.util.ArrayList;

/**
 * Created by Anthony on 11/5/2016.
 */
public class CommandParser {

    public CommandContainer parse(String rw, MessageReceivedEvent event){
        ArrayList<String> split = new ArrayList<String>();
        String raw = rw;
        String beheaded = raw.replaceFirst("~!", "");
        String[] splitBeheaded = beheaded.split(" ");
        for(String s : splitBeheaded){split.add(s);}
        String invoke = split.get(0);
        String[] args = new String[split.size() - 1];
        split.subList(1, split.size()).toArray(args);

        return new CommandContainer(raw, beheaded, splitBeheaded, invoke, args, event);
    }

    public class CommandContainer{
        public final String raw;
        public final String beheaded;
        public final String[] splitBeheaded;
        public final String invoke;
        public final String[] args;
        public final MessageReceivedEvent event;

        public CommandContainer(String rw, String beheaded, String[] splitBeheaded, String invoke, String[] args, MessageReceivedEvent event){
            this.raw = rw;
            this.beheaded = beheaded;
            this.splitBeheaded = splitBeheaded;
            this.invoke = invoke;
            this.args = args;
            this.event = event;
        }
    }

}
