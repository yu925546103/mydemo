package demo;

/**
 * @Author yujt
 * @Date 2022/4/14 14:14
 * @Version 1.0
 */

import com.alibaba.com.caucho.hessian.io.HessianInput;
import com.alibaba.com.caucho.hessian.io.HessianOutput;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * @Auther: zhaoxinguo
 * @Date: 2018/8/23 10:48
 * @Description: Hessian实现序列化、反序列化
 */
public class Seri {

    /**
     * Hessian实现序列化
     *
     * @param cpb
     * @return
     * @throws IOException
     */
    public static byte[] serialize(CpbParamDTO cpb) {
        ByteArrayOutputStream byteArrayOutputStream = null;
        HessianOutput hessianOutput = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            // Hessian的序列化输出
            hessianOutput = new HessianOutput(byteArrayOutputStream);
            hessianOutput.writeObject(cpb);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                hessianOutput.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * Hessian实现反序列化
     *
     * @param employeeArray
     * @return
     */
    public static CpbParamDTO deserialize(byte[] employeeArray) {
        ByteArrayInputStream byteArrayInputStream = null;
        HessianInput hessianInput = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(employeeArray);
            // Hessian的反序列化读取对象
            hessianInput = new HessianInput(byteArrayInputStream);
            return (CpbParamDTO) hessianInput.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                hessianInput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        CpbParamDTO cpb = new CpbParamDTO();
        cpb.setPageIndex(1);
        cpb.setPageSize(30);
        cpb.setTest(231);
        cpb.setCount("40");
        cpb.setCpbMc("test");
        // 序列化
        byte[] serialize = serialize(cpb);
        System.out.println(serialize);
        // 反序列化
        CpbParamDTO deserialize = deserialize(serialize);
        System.out.println(deserialize.toString());
        System.out.println(deserialize.getPageIndex());
        System.out.println(deserialize.getPageSize());
        System.out.println(deserialize.getCount());
        System.out.println(deserialize.getTest());

    }

}