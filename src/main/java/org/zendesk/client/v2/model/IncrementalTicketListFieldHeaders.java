package org.zendesk.client.v2.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created with IntelliJ IDEA. User; tombeadman Date; 21/10/14 Time; 17;46
 */
public class IncrementalTicketListFieldHeaders
{
  private String generatedTimestamp;
  private String reqName;
  private String domain;
  private String submitterName;
  private String assigneeName;
  private String groupName;
  private String subject;
  private String currentTags;
  private String status;
  private String priority;
  private String via;
  private String ticketType;
  private String createdAt;
  private String updatedAt;
  private String assignedAt;
  private String organizationName;
  private String dueDate;
  private String initiallyAssignedAt;
  private String solvedAt;
  private String resolutionTime;
  private String satisfactionScore;
  private String groupStations;
  private String assigneeStations;
  private String reopens;
  private String replies;
  private String firstReplyTimeInMinutes;
  private String firstReplyTimeInMinutesWithinBusinessHours;
  private String firstResolutionTimeInMinutes;
  private String firstResolutionTimeInMinutesWithinBusinessHours;
  private String fullResolutionTimeInMinutes;
  private String fullResolutionTimeInMinutesWithinBusinessHours;
  private String agentWaitTimeInMinutes;
  private String agentWaitTimeInMinutesWithinBusinessHours;
  private String requesterWaitTimeInMinutes;
  private String requesterWaitTimeInMinutesWithinBusinessHours;
  private String onHoldTimeInMinutes;
  private String onHoldTimeInMinutesWithinBusinessHours;
  private String assigneeId;
  private String assigneeExternalId;
  private String groupId;
  private String field20793097;
  private String field20877577;
  private String field23022521;
  private String field20999236;
  private String field20855123;
  private String field20793197;
  private String field22458261;
  private String field22447183;
  private String field23021612;
  private String field23771976;
  private String field23744988;
  private String url;
  private String reqExternalId;
  private String reqEmail;
  private String reqId;
  private String id;


  @JsonProperty("generated_timestamp")
  public String getGeneratedTimestamp()
  {
    return generatedTimestamp;
  }

  public void setGeneratedTimestamp( final String generatedTimestamp )
  {
    this.generatedTimestamp = generatedTimestamp;
  }

  @JsonProperty("req_name")
  public String getReqName()
  {
    return reqName;
  }

  public void setReqName( final String reqName )
  {
    this.reqName = reqName;
  }

  public String getDomain()
  {
    return domain;
  }

  public void setDomain( final String domain )
  {
    this.domain = domain;
  }

  @JsonProperty("submitter_name")
  public String getSubmitterName()
  {
    return submitterName;
  }

  public void setSubmitterName( final String submitterName )
  {
    this.submitterName = submitterName;
  }

  @JsonProperty("assignee_name")
  public String getAssigneeName()
  {
    return assigneeName;
  }

  public void setAssigneeName( final String assigneeName )
  {
    this.assigneeName = assigneeName;
  }

  @JsonProperty("group_name")
  public String getGroupName()
  {
    return groupName;
  }

  public void setGroupName( final String groupName )
  {
    this.groupName = groupName;
  }

  public String getSubject()
  {
    return subject;
  }

  public void setSubject( final String subject )
  {
    this.subject = subject;
  }

  @JsonProperty("current_tags")
  public String getCurrentTags()
  {
    return currentTags;
  }

  public void setCurrentTags( final String currentTags )
  {
    this.currentTags = currentTags;
  }

  public String getStatus()
  {
    return status;
  }

  public void setStatus( final String status )
  {
    this.status = status;
  }

  public String getPriority()
  {
    return priority;
  }

  public void setPriority( final String priority )
  {
    this.priority = priority;
  }

  public String getVia()
  {
    return via;
  }

  public void setVia( final String via )
  {
    this.via = via;
  }

  @JsonProperty("ticket_type")
  public String getTicketType()
  {
    return ticketType;
  }

  public void setTicketType( final String ticketType )
  {
    this.ticketType = ticketType;
  }

  @JsonProperty("created_at")
  public String getCreatedAt()
  {
    return createdAt;
  }

  public void setCreatedAt( final String createdAt )
  {
    this.createdAt = createdAt;
  }

  @JsonProperty("updated_at")
  public String getUpdatedAt()
  {
    return updatedAt;
  }

  public void setUpdatedAt( final String updatedAt )
  {
    this.updatedAt = updatedAt;
  }

  @JsonProperty("assigned_at")
  public String getAssignedAt()
  {
    return assignedAt;
  }

  public void setAssignedAt( final String assignedAt )
  {
    this.assignedAt = assignedAt;
  }

  @JsonProperty("organization_name")
  public String getOrganizationName()
  {
    return organizationName;
  }

  public void setOrganizationName( final String organizationName )
  {
    this.organizationName = organizationName;
  }

  @JsonProperty("due_date")
  public String getDueDate()
  {
    return dueDate;
  }

  public void setDueDate( final String dueDate )
  {
    this.dueDate = dueDate;
  }

  @JsonProperty("initially_assigned_at")
  public String getInitiallyAssignedAt()
  {
    return initiallyAssignedAt;
  }

  public void setInitiallyAssignedAt( final String initiallyAssignedAt )
  {
    this.initiallyAssignedAt = initiallyAssignedAt;
  }

  @JsonProperty("solved_at")
  public String getSolvedAt()
  {
    return solvedAt;
  }

  public void setSolvedAt( final String solvedAt )
  {
    this.solvedAt = solvedAt;
  }

  @JsonProperty("resolution_time")
  public String getResolutionTime()
  {
    return resolutionTime;
  }

  public void setResolutionTime( final String resolutionTime )
  {
    this.resolutionTime = resolutionTime;
  }

  @JsonProperty("satisfaction_score")
  public String getSatisfactionScore()
  {
    return satisfactionScore;
  }

  public void setSatisfactionScore( final String satisfactionScore )
  {
    this.satisfactionScore = satisfactionScore;
  }

  @JsonProperty("group_stations")
  public String getGroupStations()
  {
    return groupStations;
  }

  public void setGroupStations( final String groupStations )
  {
    this.groupStations = groupStations;
  }

  @JsonProperty("assignee_stations")
  public String getAssigneeStations()
  {
    return assigneeStations;
  }

  public void setAssigneeStations( final String assigneeStations )
  {
    this.assigneeStations = assigneeStations;
  }

  public String getReopens()
  {
    return reopens;
  }

  public void setReopens( final String reopens )
  {
    this.reopens = reopens;
  }

  public String getReplies()
  {
    return replies;
  }

  public void setReplies( final String replies )
  {
    this.replies = replies;
  }

  @JsonProperty("first_reply_time_in_minutes")
  public String getFirstReplyTimeInMinutes()
  {
    return firstReplyTimeInMinutes;
  }

  public void setFirstReplyTimeInMinutes( final String firstReplyTimeInMinutes )
  {
    this.firstReplyTimeInMinutes = firstReplyTimeInMinutes;
  }

  @JsonProperty("first_reply_time_in_minutes_within_business_hours")
  public String getFirstReplyTimeInMinutesWithinBusinessHours()
  {
    return firstReplyTimeInMinutesWithinBusinessHours;
  }

  public void setFirstReplyTimeInMinutesWithinBusinessHours( final String firstReplyTimeInMinutesWithinBusinessHours )
  {
    this.firstReplyTimeInMinutesWithinBusinessHours = firstReplyTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("first_resolution_time_in_minutes")
  public String getFirstResolutionTimeInMinutes()
  {
    return firstResolutionTimeInMinutes;
  }

  public void setFirstResolutionTimeInMinutes( final String firstResolutionTimeInMinutes )
  {
    this.firstResolutionTimeInMinutes = firstResolutionTimeInMinutes;
  }

  @JsonProperty("first_resolution_time_in_minutes_within_business_hours")
  public String getFirstResolutionTimeInMinutesWithinBusinessHours()
  {
    return firstResolutionTimeInMinutesWithinBusinessHours;
  }

  public void setFirstResolutionTimeInMinutesWithinBusinessHours(
    final String firstResolutionTimeInMinutesWithinBusinessHours )
  {
    this.firstResolutionTimeInMinutesWithinBusinessHours = firstResolutionTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("full_resolution_time_in_minutes")
  public String getFullResolutionTimeInMinutes()
  {
    return fullResolutionTimeInMinutes;
  }

  public void setFullResolutionTimeInMinutes( final String fullResolutionTimeInMinutes )
  {
    this.fullResolutionTimeInMinutes = fullResolutionTimeInMinutes;
  }

  @JsonProperty("full_resolution_time_in_minutes_within_business_hours")
  public String getFullResolutionTimeInMinutesWithinBusinessHours()
  {
    return fullResolutionTimeInMinutesWithinBusinessHours;
  }

  public void setFullResolutionTimeInMinutesWithinBusinessHours(
    final String fullResolutionTimeInMinutesWithinBusinessHours )
  {
    this.fullResolutionTimeInMinutesWithinBusinessHours = fullResolutionTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("agent_wait_time_in_minutes")
  public String getAgentWaitTimeInMinutes()
  {
    return agentWaitTimeInMinutes;
  }

  public void setAgentWaitTimeInMinutes( final String agentWaitTimeInMinutes )
  {
    this.agentWaitTimeInMinutes = agentWaitTimeInMinutes;
  }

  @JsonProperty("agent_wait_time_in_minutes_within_business_hours")
  public String getAgentWaitTimeInMinutesWithinBusinessHours()
  {
    return agentWaitTimeInMinutesWithinBusinessHours;
  }

  public void setAgentWaitTimeInMinutesWithinBusinessHours( final String agentWaitTimeInMinutesWithinBusinessHours )
  {
    this.agentWaitTimeInMinutesWithinBusinessHours = agentWaitTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("requester_wait_time_in_minutes")
  public String getRequesterWaitTimeInMinutes()
  {
    return requesterWaitTimeInMinutes;
  }

  public void setRequesterWaitTimeInMinutes( final String requesterWaitTimeInMinutes )
  {
    this.requesterWaitTimeInMinutes = requesterWaitTimeInMinutes;
  }

  @JsonProperty("requester_wait_time_in_minutes_within_business_hours")
  public String getRequesterWaitTimeInMinutesWithinBusinessHours()
  {
    return requesterWaitTimeInMinutesWithinBusinessHours;
  }

  public void setRequesterWaitTimeInMinutesWithinBusinessHours(
    final String requesterWaitTimeInMinutesWithinBusinessHours )
  {
    this.requesterWaitTimeInMinutesWithinBusinessHours = requesterWaitTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("on_hold_time_in_minutes")
  public String getOnHoldTimeInMinutes()
  {
    return onHoldTimeInMinutes;
  }

  public void setOnHoldTimeInMinutes( final String onHoldTimeInMinutes )
  {
    this.onHoldTimeInMinutes = onHoldTimeInMinutes;
  }

  @JsonProperty("on_hold_time_in_minutes_within_business_hours")
  public String getOnHoldTimeInMinutesWithinBusinessHours()
  {
    return onHoldTimeInMinutesWithinBusinessHours;
  }

  public void setOnHoldTimeInMinutesWithinBusinessHours( final String onHoldTimeInMinutesWithinBusinessHours )
  {
    this.onHoldTimeInMinutesWithinBusinessHours = onHoldTimeInMinutesWithinBusinessHours;
  }

  @JsonProperty("assignee_id")
  public String getAssigneeId()
  {
    return assigneeId;
  }

  public void setAssigneeId( final String assigneeId )
  {
    this.assigneeId = assigneeId;
  }

  @JsonProperty("assignee_external_id")
  public String getAssigneeExternalId()
  {
    return assigneeExternalId;
  }

  public void setAssigneeExternalId( final String assigneeExternalId )
  {
    this.assigneeExternalId = assigneeExternalId;
  }

  @JsonProperty("group_id")
  public String getGroupId()
  {
    return groupId;
  }

  public void setGroupId( final String groupId )
  {
    this.groupId = groupId;
  }

  @JsonProperty("field_20793097")
  public String getField20793097()
  {
    return field20793097;
  }

  public void setField20793097( final String field20793097 )
  {
    this.field20793097 = field20793097;
  }

  @JsonProperty("field_20877577")
  public String getField20877577()
  {
    return field20877577;
  }

  public void setField20877577( final String field20877577 )
  {
    this.field20877577 = field20877577;
  }

  @JsonProperty("field_23022521")
  public String getField23022521()
  {
    return field23022521;
  }

  public void setField23022521( final String field23022521 )
  {
    this.field23022521 = field23022521;
  }

  @JsonProperty("field_20999236")
  public String getField20999236()
  {
    return field20999236;
  }

  public void setField20999236( final String field20999236 )
  {
    this.field20999236 = field20999236;
  }

  @JsonProperty("field_20855123")
  public String getField20855123()
  {
    return field20855123;
  }

  public void setField20855123( final String field20855123 )
  {
    this.field20855123 = field20855123;
  }

  @JsonProperty("field_20793197")
  public String getField20793197()
  {
    return field20793197;
  }

  public void setField20793197( final String field20793197 )
  {
    this.field20793197 = field20793197;
  }

  @JsonProperty("field_22458261")
  public String getField22458261()
  {
    return field22458261;
  }

  public void setField22458261( final String field22458261 )
  {
    this.field22458261 = field22458261;
  }

  @JsonProperty("field_22447183")
  public String getField22447183()
  {
    return field22447183;
  }

  public void setField22447183( final String field22447183 )
  {
    this.field22447183 = field22447183;
  }

  @JsonProperty("field_23021612")
  public String getField23021612()
  {
    return field23021612;
  }

  public void setField23021612( final String field23021612 )
  {
    this.field23021612 = field23021612;
  }

  @JsonProperty("field_23771976")
  public String getField23771976()
  {
    return field23771976;
  }

  public void setField23771976( final String field23771976 )
  {
    this.field23771976 = field23771976;
  }

  @JsonProperty("field_23744988")
  public String getField23744988()
  {
    return field23744988;
  }

  public void setField23744988( final String field23744988 )
  {
    this.field23744988 = field23744988;
  }

  public String getUrl()
  {
    return url;
  }

  public void setUrl( final String url )
  {
    this.url = url;
  }

  @JsonProperty("req_external_id")
  public String getReqExternalId()
  {
    return reqExternalId;
  }

  public void setReqExternalId( final String reqExternalId )
  {
    this.reqExternalId = reqExternalId;
  }

  @JsonProperty("req_email")
  public String getReqEmail()
  {
    return reqEmail;
  }

  public void setReqEmail( final String reqEmail )
  {
    this.reqEmail = reqEmail;
  }

  @JsonProperty("req_id")
  public String getReqId()
  {
    return reqId;
  }

  public void setReqId( final String reqId )
  {
    this.reqId = reqId;
  }

  public String getId()
  {
    return id;
  }

  public void setId( final String id )
  {
    this.id = id;
  }
}
