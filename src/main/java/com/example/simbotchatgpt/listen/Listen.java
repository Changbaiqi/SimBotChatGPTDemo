package com.example.simbotchatgpt.listen;

import com.example.simbotchatgpt.utils.GPT3;
import love.forte.simboot.annotation.ContentTrim;
import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.GroupMessageEvent;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Listen {

    @Listener
    @ContentTrim
    @Filter(targets = @Filter.Targets(atBot = true))
    public void listenGroup(GroupMessageEvent event){
        event.getSource().sendBlocking( new GPT3().returnGPT3(event.getMessageContent().getPlainText()));
    }
}
