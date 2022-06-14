package top.whitecola.mdtransofm.services;

import top.whitecola.siesta.annotations.Component;
import top.whitecola.siesta.annotations.Inject;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Component
public class DeviceJsonFileService {
    @Inject
    private TransformService transformService;

    @Inject
    private FileService fileService;

    public void StringDeviceFileToByteDeviceFile(File stringDeviceFile,File byteDeviceFile) throws IOException {
        String stringDeviceJson = fileService.readTextFromFile(stringDeviceFile, StandardCharsets.UTF_8);
        String byteDeviceJson = transformService.transformToByteDeviceJson(stringDeviceJson);
        fileService.writeTextToFile(byteDeviceJson,byteDeviceFile,false,StandardCharsets.UTF_8);
    }
}
