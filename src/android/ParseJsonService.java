package com.vaenow.appupdate.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.json.JSONObject;

/**
 * Created by Wade on 2017/5/12.
 */
public class ParseJsonService {
    public HashMap<String, String> parseJson(InputStream inStream) throws Exception {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inStream));
        StringBuilder sb = new StringBuilder();

        String line = null;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String jsonString = sb.toString();
        JSONObject jsonObject = new JSONObject(jsonString);
        //软件版本
        hashMap.put("version", (String) jsonObject.get("version"));
        //软件名称
        hashMap.put("name", (String) jsonObject.get("name"));
        //下载地址
        hashMap.put("url", (String) jsonObject.get("url"));
        return hashMap;
    }
}
