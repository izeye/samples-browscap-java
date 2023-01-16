package com.izeye.sample;

import com.blueconic.browscap.Capabilities;
import com.blueconic.browscap.ParseException;
import com.blueconic.browscap.UserAgentService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Capabilities capabilities = new UserAgentService().loadParser().parse("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/108.0.0.0 Safari/537.36");
        System.out.println(capabilities);
    }
}
