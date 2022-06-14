# Mirai-device.json-transformer
把 Mirai-console 的 device.json 转换为 Mirai-Core 的 device.json。(新版本不同,导致没办法通过 Mirai-console 生成 device.json 来替换 Mirai-Core 生成的来用。)

此项目基于我开发的 Siesta 开发框架 : 

[![](https://img.shields.io/badge/Siesta-framework-red.svg)]([https://namemc.com/profile/White_cola.1](https://github.com/itscola/Siesta-framework))

# 演示:

```java
@ApplicationMain
public class MDTransfomer implements IAppMain {

    @Inject
    private DeviceJsonFileService deviceJsonFileService;

    @Override
    public void AppMain(String[] strings) {
        try {
            deviceJsonFileService.StringDeviceFileToByteDeviceFile(new File("./newDevice.json"),new File("./Device.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

```java
@Component
public class TransformService {
    @Inject
    private ByteServices byteServices;

    @Inject
    private GsonComponent gsonComponent;

    public String transformToByteDeviceJson(String stringJson){
        StringDeviceBean stringDeviceBean = gsonComponent.getGson().fromJson(stringJson, StringDeviceBean.class);
        ByteDeviceBean byteDeviceBean = this.stringDeviceBeanToByteDeviceBean(stringDeviceBean);
        return gsonComponent.getGson().toJson(byteDeviceBean,ByteDeviceBean.class);
    }

    
    ...
}
```
