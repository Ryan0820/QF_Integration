package com.yan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;

@Controller
public class EmailController {

    @Autowired
    EmailService emailService;

    @RequestMapping("/template")
    @ResponseBody
    public String sendTemplateMail(){
        emailService.sendTemplateMail("2393059399@qq.com","标题","info.ftl");
        return "发送成功";
    }
    @RequestMapping("/simple")
    @ResponseBody
    public String sendSimpleEmail(){
        emailService.sendSimpleMail("2393059399@qq.com","标题","发送邮件内容！");

        return "发送成功";
    }

    @RequestMapping("/attachement")
    @ResponseBody
    public String sendAttachementEmail(){

        File file = new File("src/main/resources/static/test.txt");

        emailService.sendAttachentMail("2393059399@qq.com","标题","发送邮件内容！",file);

        return "发送成功";
    }

}
