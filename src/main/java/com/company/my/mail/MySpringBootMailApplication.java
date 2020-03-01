package com.company.my.mail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 邮件服务：
 *  1.引入：
 *      spring-boot-starter-mail
 *  2.邮件发送逻辑：例如，张三发邮件给李四
 *      1.张三用自己的邮箱账号密码登陆到发送的邮箱服务器，然后由发送的邮箱服务器发送给李四接收邮件的服务器
 *      2.所以要配置发送人的用户名和密码
 *          1.以qq邮箱为例，首先去到qq邮箱：设置->账户->POP3/IMAP/SMTP/Exchange/CardDAV/CalDAV服务，开启对应的服务
 *          2.开启后会生成一个授权码，这个授权码就是邮箱发送邮件的密码
 *          3.详细见application.yaml中的配置
 *
 */

@SpringBootApplication
public class MySpringBootMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(MySpringBootMailApplication.class, args);
    }

}
