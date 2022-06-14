package top.whitecola.mdtransofm;

import top.whitecola.mdtransofm.services.ByteServices;
import top.whitecola.mdtransofm.services.DeviceJsonFileService;
import top.whitecola.mdtransofm.services.TransformService;
import top.whitecola.siesta.annotations.ApplicationMain;
import top.whitecola.siesta.annotations.Inject;
import top.whitecola.siesta.loader.IAppMain;

import java.io.File;
import java.io.IOException;

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
