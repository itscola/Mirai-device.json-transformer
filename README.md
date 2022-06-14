# Mirai-device.json-transformer
To transform device.json from Mirai-Console to Mirai-Core or contrary.

The project based on Siesta-framework made by me :   

[![](https://img.shields.io/badge/Siesta-framework-red.svg)]([https://namemc.com/profile/White_cola.1](https://github.com/itscola/Siesta-framework))


[中文 README](README-ZHCN.md)

# demo:

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
