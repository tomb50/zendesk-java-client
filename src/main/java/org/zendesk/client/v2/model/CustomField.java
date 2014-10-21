package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 12/10/2014 Time: 00:37
 */
public class CustomField
{
  public CustomField(){}

  private Long id;
  private String name;
  private String rawName;
  private String value;

  public Long getId()
  {
    return id;
  }

  public void setId( final Long id )
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName( final String name )
  {
    this.name = name;
  }

  @JsonProperty("raw_name")
  public String getRawName()
  {
    return rawName;
  }

  public void setRawName( final String rawName )
  {
    this.rawName = rawName;
  }

  public String getValue()
  {
    return value;
  }

  public void setValue( final String value )
  {
    this.value = value;
  }
}
