package org.zendesk.client.v2.model;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 10/10/2014 Time: 13:59
 */
public enum Role {
  END_USER("end-user"),
  AGENT("agent"),
  ADMIN("admin");

  private final String name;

  private Role(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }
}

