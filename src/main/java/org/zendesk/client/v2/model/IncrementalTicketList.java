package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 21/10/14 Time: 17:32
 */
public class IncrementalTicketList
{
  private List<IncrementalTicket> results;
  private IncrementalTicketListFieldHeaders fieldHeaders;
  private IncrementalTicketListOptions options;
  private Long endTime;
  private String nextPage;

  public List<IncrementalTicket> getResults()
  {
    return results;
  }

  public void setResults( final List<IncrementalTicket> results )
  {
    this.results = results;
  }

  @JsonProperty("field_headers")
  public IncrementalTicketListFieldHeaders getFieldHeaders()
  {
    return fieldHeaders;
  }

  public void setFieldHeaders( final IncrementalTicketListFieldHeaders fieldHeaders )
  {
    this.fieldHeaders = fieldHeaders;
  }

  public IncrementalTicketListOptions getOptions()
  {
    return options;
  }

  public void setOptions( final IncrementalTicketListOptions options )
  {
    this.options = options;
  }

  public Long getEndTime()
  {
    return endTime;
  }

  public void setEndTime( final Long endTime )
  {
    this.endTime = endTime;
  }

  public String getNextPage()
  {
    return nextPage;
  }

  public void setNextPage( final String nextPage )
  {
    this.nextPage = nextPage;
  }
}
