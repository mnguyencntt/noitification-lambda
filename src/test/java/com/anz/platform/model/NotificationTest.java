package com.anz.platform.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.jupiter.api.Test;
import com.anz.platform.model.Notification;

public class NotificationTest {
  @Test
  public void testNotification() {
    int expectedLength = 13;

    Notification notification = new Notification();
    notification.setId("12345");

    String fieldJoining = notification.findFieldsJoining();
    System.out.println(fieldJoining);
    assertTrue(fieldJoining.startsWith("id,receiverUserId,subject,contentBody"));
    assertEquals(expectedLength, fieldJoining.split(",").length);

    String marks = notification.findMarksJoining();
    System.out.println(marks);
    assertEquals(expectedLength, marks.chars().filter(ch -> ch == '?').count());
    assertEquals(expectedLength, marks.split(",").length);

    try {
      assertEquals("12345", notification.findValues()[0]);
      assertEquals("", notification.findValues()[1]);
      assertEquals("", notification.findValues()[2]);
    } catch (IllegalArgumentException e) {
      fail();
    }
  }
}
