package com.ocat.example.mail;

import com.ocat.example.mail.service.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author shikui@tiduyun.com
 * @date 2023/4/26
 */
@SpringBootTest(classes = MailExampleApplication.class)
@RunWith(SpringRunner.class)
public class SendGmailTest {

    @Autowired
    private MailService mailService;

    @Test
    public void send(){
        mailService.sendMimeMessge("670569467@qq.com", "嘿嘿嘿嘿","hfuewfnincweincwencew");
        System.out.println("发送完成");
    }
}