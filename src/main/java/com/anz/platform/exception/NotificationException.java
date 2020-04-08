package com.anz.platform.exception;

import com.anz.platform.exception.base.UnknownException;

public class NotificationException extends UnknownException {

  private static final long serialVersionUID = 1L;

  public NotificationException(final String errorMessage) {
    super(errorMessage);
  }

  public NotificationException(final String errorMessage, final String key) {
    super(errorMessage);
    this.setKey(key);
  }
}
