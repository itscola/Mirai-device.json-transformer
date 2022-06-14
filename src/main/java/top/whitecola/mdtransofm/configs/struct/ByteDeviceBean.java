package top.whitecola.mdtransofm.configs.struct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class ByteDeviceBean {
    private byte[] display;
    private byte[] product;
    private byte[] device;
    private byte[] board;
    private byte[] brand;
    private byte[] model;
    private byte[] bootloader;
    private byte[] fingerprint;
    private byte[] bootId;
    private byte[] procVersion;
    private List<?> baseBand;
    private VersionBean version;
    private byte[] simInfo;
    private byte[] osType;
    private byte[] macAddress;
    private byte[] wifiBSSID;
    private byte[] wifiSSID;
    private byte[] imsiMd5;
    private String imei;
    private byte[] apn;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class VersionBean {
        private byte[] incremental;
        private byte[] release;
        private byte[] codename;
    }
}
