package top.whitecola.mdtransofm.services;

import com.sun.istack.internal.NotNull;
import top.whitecola.mdtransofm.components.GsonComponent;
import top.whitecola.mdtransofm.configs.struct.ByteDeviceBean;
import top.whitecola.mdtransofm.configs.struct.StringDeviceBean;
import top.whitecola.siesta.annotations.Component;
import top.whitecola.siesta.annotations.Inject;

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

    public String transformToStringDeviceJson(String byteJson){

        return null;
    }



    public ByteDeviceBean stringDeviceBeanToByteDeviceBean(@NotNull StringDeviceBean stringDeviceBean){
        ByteDeviceBean byteDeviceBean = new ByteDeviceBean();

        byteDeviceBean.setDisplay(byteServices.stringToBytes(stringDeviceBean.getData().getDevice()));
        byteDeviceBean.setProduct(byteServices.stringToBytes(stringDeviceBean.getData().getProduct()));
        byteDeviceBean.setDevice(byteServices.stringToBytes(stringDeviceBean.getData().getDevice()));
        byteDeviceBean.setBoard(byteServices.stringToBytes(stringDeviceBean.getData().getBoard()));
        byteDeviceBean.setBrand(byteServices.stringToBytes(stringDeviceBean.getData().getBrand()));
        byteDeviceBean.setModel(byteServices.stringToBytes(stringDeviceBean.getData().getModel()));
        byteDeviceBean.setBootloader(byteServices.stringToBytes(stringDeviceBean.getData().getBootloader()));
        byteDeviceBean.setFingerprint(byteServices.stringToBytes(stringDeviceBean.getData().getFingerprint()));
        byteDeviceBean.setBootId(byteServices.stringToBytes(stringDeviceBean.getData().getBootId()));
        byteDeviceBean.setProcVersion(byteServices.stringToBytes(stringDeviceBean.getData().getProcVersion()));

        ByteDeviceBean.VersionBean versionBean = new ByteDeviceBean.VersionBean();
        versionBean.setIncremental(byteServices.stringToBytes(stringDeviceBean.getData().getVersion().getIncremental()));
        versionBean.setRelease(byteServices.stringToBytes(stringDeviceBean.getData().getVersion().getRelease()));
        versionBean.setCodename(byteServices.stringToBytes(stringDeviceBean.getData().getVersion().getCodename()));

        byteDeviceBean.setVersion(versionBean);
        byteDeviceBean.setSimInfo(byteServices.stringToBytes(stringDeviceBean.getData().getSimInfo()));
        byteDeviceBean.setOsType(byteServices.stringToBytes(stringDeviceBean.getData().getOsType()));
        byteDeviceBean.setMacAddress(byteServices.stringToBytes(stringDeviceBean.getData().getMacAddress()));
        byteDeviceBean.setWifiBSSID(byteServices.stringToBytes(stringDeviceBean.getData().getWifiBSSID()));
        byteDeviceBean.setWifiSSID(byteServices.stringToBytes(stringDeviceBean.getData().getWifiSSID()));
        byteDeviceBean.setImsiMd5(byteServices.stringToBytes(stringDeviceBean.getData().getImsiMd5()));
        byteDeviceBean.setImei(stringDeviceBean.getData().getImei());
        byteDeviceBean.setApn(byteServices.stringToBytes(stringDeviceBean.getData().getApn()));
        return byteDeviceBean;
    }
}
