package com.yan;

import java.io.File;

public interface EmailService {

    //发送简单文件
    void sendSimpleMail(String sendTo,String title,String content);


    //发送模板邮件
    void sendTemplateMail(String sendTo,String title,String info, File file);
    void sendTemplateMail(String sendTo,String title,String info);


    //发送带有附件的邮件
    void sendAttachentMail(String sendTo,String title,String content, File file);
}
