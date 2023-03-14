package jvm.jdk8.oom;

/**
 * @author caochengyin
 * @version v 1.0.0
 * @date 2023/3/13
 * @description 尝试复现2023/03宕机场景
 */
public class Oom202303 {
    private static final int _1M = 1024 * 1024;

    /**
     * jdk8
     * jvm配置：
     * -Xmx8m -Xms8m -XX:MaxPermSize=256k -XX:PermSize=256k -XX:+UseG1GC -XX:+HeapDumpOnOutOfMemoryError
     *
     * @param args
     */
    public static void main(String[] args) {
        byte[] bytes = null;
        while (true) {
            bytes = new byte[_1M];
            bytes = null;
        }
    }
}
