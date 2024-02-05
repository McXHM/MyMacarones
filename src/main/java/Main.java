import com.esotericsoftware.yamlbeans.YamlException;
import gameutils.Configs;
import gameutils.Exps;

import java.io.FileNotFoundException;

/**
 * 主函数
 */
public class Main {
    /**
     * 主函数
     *
     * @param args 字符段
     * @throws YamlException         Yaml
     * @throws FileNotFoundException 文件未找到
     */
    public static void main(String[] args) throws YamlException, FileNotFoundException {
        for (int i = 0; i < 100; i++) {
            Exps exps = Exps.calExps(i);
            System.out.println("当前等级为 >> " + exps.level + "(" + exps.exp + "/" + exps.level * 8 + ")");
        }
    }
}
