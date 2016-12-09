package 第二章内存区域与内存溢出异常;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by eason on 2016/12/9.
 */
public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (true){
            list.add(String.valueOf(i++).intern());
        }
    }
}
