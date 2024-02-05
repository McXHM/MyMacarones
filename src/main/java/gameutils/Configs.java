package gameutils;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;

/**
 * 配置文件
 */
public class Configs {
    /**
     * 初始化函数
     *
     * @throws FileNotFoundException 文件未找到
     * @throws YamlException         Yaml
     */
    public static void init() throws FileNotFoundException, YamlException {
        YamlReader reader = new YamlReader(new FileReader("src/main/resources/configs/config.yml"));
        Object object = reader.read();
        System.out.println(object);
        Map map = (Map) object;
        System.out.println(map.get("address"));
    }
}
