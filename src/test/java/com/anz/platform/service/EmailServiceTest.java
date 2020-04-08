package com.anz.platform.service;

import org.junit.Ignore;
import org.junit.Test;
import com.anz.platform.config.AppConfigMock;
import com.anz.platform.domain.MessageInfo;

public class EmailServiceTest {
  @Ignore
  @Test
  public void testSendEmail() {
    final String subject = String.format("[AnZ-Platform] %s with OrderId-%s", "ORDER_CREATED", "OI12345");
    final String contentBody = String.format("[AnZ-Platform] %s with OrderId-%s", "ORDER_CREATED", "OI12345");
    final MessageInfo messageInfo = new MessageInfo(subject, contentBody, "+6593767011", "m.nguyencntt7891@gmail.com");

    EmailService emailService = new EmailService(new AppConfigMock().getEmailInfo());
    emailService.sendEmailSSL(messageInfo);
    emailService.sendEmailTLS(messageInfo);
  }
}
