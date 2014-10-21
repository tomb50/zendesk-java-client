package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA. User: tombeadman Date: 12/10/2014 Time: 00:24
 */
public class OrganizationFields
{

  public OrganizationFields(){}
  //DONT COMMIT, ENUMS NOT DONE - FOR DEV ONLY
  private Long id;
  private String url;
  private String key;
  private String type;
  private String title;
  private String rawTitle;
  private String description;
  private String rawDescription;
  private Long position;
  private Boolean active;
  private Boolean system;
  private String regexForValidation;
  private Date createdAt;
  private Date updatedAt;
  private String tag;
  private List<CustomField> customFieldOptions;

  public Long getId()
  {
    return id;
  }

  public void setId( final Long id )
  {
    this.id = id;
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl( final String url )
  {
    this.url = url;
  }

  public String getKey()
  {
    return key;
  }

  public void setKey( final String key )
  {
    this.key = key;
  }

  public String getType()
  {
    return type;
  }

  public void setType( final String type )
  {
    this.type = type;
  }

  public String getTitle()
  {
    return title;
  }

  public void setTitle( final String title )
  {
    this.title = title;
  }

  @JsonProperty("raw_title")
  public String getRawTitle()
  {
    return rawTitle;
  }

  public void setRawTitle( final String rawTitle )
  {
    this.rawTitle = rawTitle;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription( final String description )
  {
    this.description = description;
  }

  @JsonProperty("raw_description")
  public String getRawDescription()
  {
    return rawDescription;
  }

  public void setRawDescription( final String rawDescription )
  {
    this.rawDescription = rawDescription;
  }

  public Long getPosition()
  {
    return position;
  }

  public void setPosition( final Long position )
  {
    this.position = position;
  }

  public Boolean getActive()
  {
    return active;
  }

  public void setActive( final Boolean active )
  {
    this.active = active;
  }

  public Boolean getSystem()
  {
    return system;
  }

  public void setSystem( final Boolean system )
  {
    this.system = system;
  }

  @JsonProperty("regexp_for_validation")
  public String getRegexForValidation()
  {
    return regexForValidation;
  }

  public void setRegexForValidation( final String regexForValidation )
  {
    this.regexForValidation = regexForValidation;
  }

  @JsonProperty("created_at")
  public Date getCreatedAt()
  {
    return createdAt;
  }

  public void setCreatedAt( final Date createdAt )
  {
    this.createdAt = createdAt;
  }

  @JsonProperty("updated_at")
  public Date getUpdatedAt()
  {
    return updatedAt;
  }

  public void setUpdatedAt( final Date updatedAt )
  {
    this.updatedAt = updatedAt;
  }

  public String getTag()
  {
    return tag;
  }

  public void setTag( final String tag )
  {
    this.tag = tag;
  }
  @JsonProperty("custom_field_options")
  public List<CustomField> getCustomFieldOptions()
  {
    return customFieldOptions;
  }

  public void setCustomFieldOptions( final List<CustomField> customFieldOptions )
  {
    this.customFieldOptions = customFieldOptions;
  }
}
