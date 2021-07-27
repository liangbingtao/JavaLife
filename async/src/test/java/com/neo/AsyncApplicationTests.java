package com.neo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class AsyncApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件

        SimpleMailMessage mailMessage = new SimpleMailMessage();

        mailMessage.setSubject("打个招呼");
        mailMessage.setText("你好啊，今天是2021年7月24日");
        mailMessage.setFrom("1607247596@qq.com");
        mailMessage.setTo("1607247596@qq.com");

        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {

        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

        helper.setSubject("打个招呼");
        helper.setText("<p style='color:red'>今天是2021年7月24日，你好啊，我是neo</p>",true);

        //附件
        helper.addAttachment("1.jpg",new File("src/main/resources/static/img/1.jpg"));
        helper.setFrom("1607247596@qq.com");
        helper.setTo("liangbtChina@163.com");
        mailSender.send(mimeMessage);
    }




}
