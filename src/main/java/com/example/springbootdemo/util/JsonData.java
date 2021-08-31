package com.example.springbootdemo.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonData {
    private int code;
    private String msg;
    private Object data;

    public static String BuildJsonData(int c, String m, Object d) {
        JsonData jsonData=new JsonData(c,m,d);
        ObjectMapper objectMapper=new ObjectMapper();
        String result = "";
        try {
            result = objectMapper.writeValueAsString(jsonData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return result;
    }
}
