package org.zendesk.client.v2.model;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 10/10/2014 Time: 13:59
 */
public enum TicketRestriction
{
  ORGANIZATION( "organization" ),
  GROUPS( "groups" ),
  ASSIGNED( "assigned" ),
  REQUESTED( "requested" );

  private final String name;

  private TicketRestriction( String name )
  {
    this.name = name;
  }

  @Override
  public String toString()
  {
    return name().toLowerCase();
  }
}
