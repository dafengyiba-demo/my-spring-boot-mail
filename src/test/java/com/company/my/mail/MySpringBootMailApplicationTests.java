package com.company.my.mail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@SpringBootTest
class MySpringBootMailApplicationTests {


    @Autowired
    JavaMailSender mailSender;

    @Test
    void contextLoads() {
        //简单邮件发送
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setSubject("今晚开会");
        mailMessage.setText("今晚八点开会！");
        mailMessage.setTo("1361808xxxx@163.com");
        mailMessage.setFrom("104239xxxx@qq.com");
        mailSender.send(mailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {
        //复杂邮件发送
        MimeMessage mailMessage = mailSender.createMimeMessage();
        //邮件内容
        MimeMessageHelper helper = new MimeMessageHelper(mailMessage,true);
        helper.setSubject("今晚开会");
        helper.setText("<b style='color:red'> 今晚八点开会！</b>",true);
        helper.setTo("1361808xxxx@163.com");
        helper.setFrom("104239xxxx@qq.com");
        //上传附件
        helper.addAttachment("附件1.jpg",new File("/Users/xmly/Desktop/IMG_2819.JPG"));
        helper.addAttachment("附件2.jpg",new File("/Users/xmly/Desktop/IMG_28192.JPG"));

        mailSender.send(mailMessage);
    }



}
