package org.javacore.io.serializable;


import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

/**
 *  描述:Java序列化和反序列化的小例子
 *
 *  transient 修饰的变量在对象串化的时侯并不会将所赋值的值保存到传中，串化的对象从磁盘读取出来仍然是null。
 *
 * Created by 子木 on 2016/2/15.
 */
public class SerializableT {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        for (int i = 0;i < 10;i++) {
            AObjcet aObjcet = new AObjcet();
            long beginTime = System.currentTimeMillis();

            ByteOutputStream byteOutput = new ByteOutputStream();
            ObjectOutputStream objectOutput = new ObjectOutputStream(byteOutput);
            objectOutput.writeObject(aObjcet);
            objectOutput.close();
            byteOutput.close();
            byte[] bytes = byteOutput.toByteArray();
            System.out.println("Java序列化耗时：" + (System.currentTimeMillis() - beginTime) + "ms");
            System.out.println("Java序列化后的字节大小为：" + bytes.length);

            beginTime = System.currentTimeMillis();
            ByteArrayInputStream byteInput = new ByteArrayInputStream(bytes);
            ObjectInputStream objectInput = new ObjectInputStream(byteInput);
            AObjcet obj = (AObjcet) objectInput.readObject();
            objectInput.close();
            byteInput.close();
            System.out.println("Java反序列化耗时：" + (System.currentTimeMillis() - beginTime) + "ms");
            System.out.println("AObject：" + obj.toString());
            
        }
    }
}
class AObjcet implements Serializable {
    private String a = "bysocket";
    private String b = "likes";
    private String c = "java";
    private transient String d = "world";

    private int i = 100;
    private int j = 10;
    private long m = 100L;

    private boolean isA = true;
    private boolean isB = false;
    private boolean isC = false;

    private BObject aObject = new BObject();
    private BObject bObject = new BObject();
    private BObject cObject = new BObject();
    private BObject dObject = new BObject();

    @Override
    public String toString() {
        return "a : " + this.a + "--b:" + this.b + "--c:" + this.c + "-- d :" + this.d;
    }
}
class BObject implements Serializable {

}
