package top.whitecola.mdtransofm.configs.struct;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class StringDeviceBean {

    private Integer deviceInfoVersion = 2;
    private DataBean data;

    @NoArgsConstructor
    @Data
    public static class DataBean {
        private String display;
        private String product;
        private String device;
        private String board;
        private String brand;
        private String model;
        private String bootloader;
        private String fingerprint;
        private String bootId;
        private String procVersion;
        private String baseBand;
        private VersionBean version;
        private String simInfo;
        private String osType;
        private String macAddress;
        private String wifiBSSID;
        private String wifiSSID;
        private String imsiMd5;
        private String imei;
        private String apn;

        @NoArgsConstructor
        @Data
        public static class VersionBean {
            private String incremental;
            private String release;
            private String codename;
        }
    }
}
