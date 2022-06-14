package top.whitecola.mdtransofm.components;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Data;
import top.whitecola.siesta.annotations.Component;

@Data
@Component
public class GsonComponent {
    private Gson gson = new GsonBuilder().enableComplexMapKeySerialization().setPrettyPrinting().setLenient().create();

}
