package com.yan;

import com.yan.email.EmailConfig;
import freemarker.template.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    EmailConfig emailConfig;

    @Autowired
    JavaMailSender mailSender;

    @Autowired
    FreeMarkerConfigurer freeMarkerConfigurer;

    //带有附件
    @Override
    public void sendAttachentMail(String sendTo, String title, String content, File file) {
        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg, true);
            helper.setFrom(emailConfig.getEmailFrom());
            helper.setTo(sendTo);
            helper.setSubject(title);
            helper.setText(content);

            FileSystemResource r = new FileSystemResource(file);
            helper.addAttachment("附件：",r);

            mailSender.send(msg);


        }catch (Exception e){
            e.printStackTrace();
        }


    }



    @Override
    public void sendSimpleMail(String sendTo, String title, String content) {
        //简单邮件发送
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(emailConfig.getEmailFrom());
        message.setTo(sendTo);
        message.setSubject(title);
        message.setText(content);


        mailSender.send(message);

    }

    @Override
    public void sendTemplateMail(String sendTo, String title, String info, File file) {

    }

    @Override
    public void sendTemplateMail(String sendTo, String title, String info) {

        MimeMessage msg = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(msg,true);
            helper.setFrom(emailConfig.getEmailFrom());
            helper.setTo(sendTo);
            helper.setSubject(title);

            //模板
            //封装模板数据
            Map<String,Object> map = new HashMap<>();
            map.put("username","模板用户名:");

            //得到模板
            Template template = freeMarkerConfigurer.getConfiguration().getTemplate(info);

            String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);
            helper.setText(html,true);

        }catch (Exception e){
            e.printStackTrace();
        }

        mailSender.send(msg);
    }
}
