package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 21/10/14 Time: 17:43
 */
public class IncrementalTicketListOptions
{
  private String timezone;
  private String hourOffset;

  public String getTimezone()
  {
    return timezone;
  }

  public void setTimezone(final String timezone)
  {
    this.timezone = timezone;
  }

  @JsonProperty("hour_offset")
  public String getHourOffset()
  {
    return hourOffset;
  }

  public void setHourOffset( final String hourOffset )
  {
    this.hourOffset = hourOffset;
  }
}
