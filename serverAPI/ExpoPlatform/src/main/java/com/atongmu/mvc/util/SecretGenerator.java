package com.atongmu.mvc.util;

import javax.crypto.Cipher;
import java.security.Key;
import java.util.Date;

/**
 * Created by yao on 6/21/17.
 */
public class SecretGenerator {

    private static String defaultSecretKey = "default_secret_key"; // default secret key
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;

    /**
     * @param secretKey Initial secret generator
     */
    public SecretGenerator(String secretKey) {
        Key key;
        try {
            key = getKey(secretKey.getBytes());
            encryptCipher = Cipher.getInstance("DES");
            encryptCipher.init(Cipher.ENCRYPT_MODE, key);
            decryptCipher = Cipher.getInstance("DES");
            decryptCipher.init(Cipher.DECRYPT_MODE, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 加密 (逻辑: 1. 将要加密的字符串转换为字节数组(byte array)<br/>
     *            2. 将第一步的字节数组作为输入使用加密器(Cipher)的doFinal方法进行加密, 返回字节数组<br/>
     *            3. 把加密后的字节数组转换成十六进制的字符串)<br/>
     * @param strIn 要加密的字符串
     * @return 返回加密后的十六进制字符串
     * @throws Exception
     */
    public String encrypt(String strIn) throws Exception {
        return byteArr2HexStr(encrypt(strIn.getBytes()));
    }

    public byte[] encrypt(byte[] arrB) throws Exception {
        return encryptCipher.doFinal(arrB);
    }

    /**
     * 解密 (逻辑: 1. 把加密后的十六进制字符串转换成字节数组(byte array)<br/>
     *            2. 将第一步的字节数组作为输入使用加密器(Cipher)的doFinal方法进行解密, 返回字节数组(byte array)<br/>
     *            3. 把解密后的字节数组转换成字符串)<br/>
     * @param strIn
     * @return
     * @throws Exception
     */
    public String decrypt(String strIn) throws Exception {
        return new String(decrypt(hexStr2ByteArr(strIn)));
    }

    public byte[] decrypt(byte[] arrB) throws Exception {
        return decryptCipher.doFinal(arrB);
    }

    public static String byteArr2HexStr(byte[] arrB) throws Exception {
        int iLen = arrB.length;
        // 每个byte用两个字符才能表示，所以字符串的长度是数组长度的两倍
        StringBuffer sb = new StringBuffer(iLen * 2);
        for (int i = 0; i < iLen; i++) {
            int intTmp = arrB[i];
            // 把负数转换为正数
            while (intTmp < 0) {
                intTmp = intTmp + 256;
            }
            // 小于0F的数需要在前面补0
            if (intTmp < 16) {
                sb.append("0");
            }
            sb.append(Integer.toString(intTmp, 16));
        }
        return sb.toString();
    }

    public static byte[] hexStr2ByteArr(String strIn) throws Exception {
        byte[] arrB = strIn.getBytes();
        int iLen = arrB.length;
        // 两个字符表示一个字节，所以字节数组长度是字符串长度除以2
        byte[] arrOut = new byte[iLen / 2];
        for (int i = 0; i < iLen; i = i + 2) {
            String strTmp = new String(arrB, i, 2);
            arrOut[i / 2] = (byte) Integer.parseInt(strTmp, 16);
        }
        return arrOut;
    }

    private Key getKey(byte[] arrBTmp) throws Exception {
        // 创建一个空的8位字节数组（默认值为0）
        byte[] arrB = new byte[8];
        // 将原始字节数组转换为8位
        for (int i = 0; i < arrBTmp.length && i < arrB.length; i++) {
            arrB[i] = arrBTmp[i];
        }
        // 生成密钥
        Key key = new javax.crypto.spec.SecretKeySpec(arrB, "DES");
        return key;
    }


    /**
     * Try it out!!!
     */
    public static void main(String[] args) {
        try {
//            long secretValue = new Date().getTime() + 60000; //
//            SecretGenerator des = new SecretGenerator("qwert123qwe"); // Server secret key
//            System.out.println("secretValue = " + secretValue);//1499335563394
//            System.out.println("Access Token：" + des.encrypt("" + secretValue));//33bb95f9861679e0f05c1c5ffdc5a568
//            System.out.println("secret Value：" + des.decrypt("33bb95f9861679e0df05c1c5ffdc5a568"));
//            Long seconds = new Date().getTime() - new Long(des.decrypt("4bf88a363d6c9b39c3f3ee7552fcb473"));
//            System.out.println(seconds);
//            System.out.println(seconds > 1000*60*30);  // true when the access token is exceeded 30 minutes.

            SecretGenerator des = new SecretGenerator("qwert123qwe");
            System.out.println("secret token: " + des.encrypt("atm"));
            System.out.println("key: " + des.decrypt("ed4c4e0b2b525c24"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}
