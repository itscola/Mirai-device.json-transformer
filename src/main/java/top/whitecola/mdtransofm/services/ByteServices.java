package top.whitecola.mdtransofm.services;

import top.whitecola.siesta.annotations.Component;

import java.nio.charset.StandardCharsets;

@Component
public class ByteServices {
    public byte[] stringToBytes(String str){
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public String bytesToString(byte[] bytes){
        String str = new String(bytes);
        return str;
    }
}
