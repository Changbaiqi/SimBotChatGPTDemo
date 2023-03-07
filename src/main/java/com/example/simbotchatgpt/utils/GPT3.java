package com.example.simbotchatgpt.utils;

import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpResponse;

public class GPT3 {

    public String returnGPT3(String text){
//        HttpResponse response = HttpRequest.get("http://localhost:8000/chat?msg="+text)
//                .execute();
        HttpResponse response = HttpRequest.post("http://localhost:8000/chat")
                .body("my_string="+text)
                .execute();
        //JSONObject jsonObject = JSONObject.parseObject( response.body());
        return response.body();
    }
}
