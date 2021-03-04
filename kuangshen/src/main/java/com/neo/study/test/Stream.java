package com.neo.study.test;

import java.io.*;

/**
 * @Description Author neo
 * Date 2020/11/24 9:26
 */
//字节流与字符流
public class Stream {
    public static void main(String[] args) throws Exception {
       /*
        //字节输出流
        //1.向文件中写入字符串
        //第1步：使用File类找到一个文件
        File file = new File("d:" + File.separator + "test.txt");//文件不存在时候会自动创建
        //第2步：通过子类实例化父类对象
        OutputStream out = null;
//        out=new FileOutputStream(file);
        out = new FileOutputStream(file, true);//此处表示在文件末尾追加内容
        //第3步：进行写操作
        String str = "\r\nHello World 梁兵涛";//   “\r\n”表示换行输出
        byte[] bytes = str.getBytes();//只能输出byte数组，所以将字符串变为byte数组
        out.write(bytes);
        //第4步：关闭输出流
        out.close();
*/

        /*
        //字节流输入
        //第1步，使用file类找到一个文件
        File file1 = new File("d:" + File.separator + "test.txt");
        //第2步：通过子类实例化父类对象
        InputStream input = null;
        input = new FileInputStream(file1);
        //第三步：进行读操作
//        byte[] bytes1 = new byte[1024];
        byte[] bytes1 = new byte[(int) file1.length()];//根据文件大小初始化数组大小
        int len = input.read(bytes1);
        //第4不：关闭输入流
        input.close();
        System.out.println("读入数据的长度："+len);
        System.out.println("内容为："+new String(bytes1,0,len));
*/

        /*
        //字符流
        //字符输出流
        //与字节流相比，可以直接输出字符串，不用在转换成byte数组后输出
        //1.向文件中写入字符串
        //第1步：使用File类找到一个文件
        File file = new File("d:" + File.separator + "test.txt");//文件不存在时候会自动创建
        //第2步：通过子类实例化父类对象
        Writer out = null;
//        out=new FileWriter(file);
        out=new FileWriter(file,true);//追加文件内容
        //第3步：进行写操作
        String str = "\r\nHello World \r\n梁兵涛";//   “\r\n”表示换行输出
        out.write(str);
        //第4步：关闭输出流
        out.close();
        */


        //字符输入流，从文件中读取内容

        //第1步，使用file类找到一个文件
        File file1 = new File("d:" + File.separator + "test.txt");
        //第2步：通过子类实例化父类对象
        Reader reader = null;
        reader = new FileReader(file1);
        //第三步：进行读操作
//        char c[]=new char[1024];
        char[] c = new char[(int) file1.length()];  //根据文件内容大小初始化数组

        int len = reader.read(c);
        //第4不：关闭输入流
        reader.close();
        System.out.println("读入数据的长度："+len);
        System.out.println("内容为："+new String(c,0,len));

    }
}
