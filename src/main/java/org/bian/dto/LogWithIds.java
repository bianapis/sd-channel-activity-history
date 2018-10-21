package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * LogWithIds
 */
public class LogWithIds   {
  private String customerChannelActivityEventHistoryReference = null;

  private String customerReference = null;

  private Object channelActivityEventHistoryRecord = null;

  private String channelActivityEventHistoryReportType = null;

  private String channelActivityEventHistoryReportParameters = null;

  private Object channelActivityEventHistoryReport = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return customerChannelActivityEventHistoryReference
  **/

  public String getCustomerChannelActivityEventHistoryReference() {
    return customerChannelActivityEventHistoryReference;
  }

  public void setCustomerChannelActivityEventHistoryReference(String customerChannelActivityEventHistoryReference) {
    this.customerChannelActivityEventHistoryReference = customerChannelActivityEventHistoryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelActivityEventHistoryRecord
  **/

  public Object getChannelActivityEventHistoryRecord() {
    return channelActivityEventHistoryRecord;
  }

  public void setChannelActivityEventHistoryRecord(Object channelActivityEventHistoryRecord) {
    this.channelActivityEventHistoryRecord = channelActivityEventHistoryRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelActivityEventHistoryReportType
  **/

  public String getChannelActivityEventHistoryReportType() {
    return channelActivityEventHistoryReportType;
  }

  public void setChannelActivityEventHistoryReportType(String channelActivityEventHistoryReportType) {
    this.channelActivityEventHistoryReportType = channelActivityEventHistoryReportType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return channelActivityEventHistoryReportParameters
  **/

  public String getChannelActivityEventHistoryReportParameters() {
    return channelActivityEventHistoryReportParameters;
  }

  public void setChannelActivityEventHistoryReportParameters(String channelActivityEventHistoryReportParameters) {
    this.channelActivityEventHistoryReportParameters = channelActivityEventHistoryReportParameters;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelActivityEventHistoryReport
  **/

  public Object getChannelActivityEventHistoryReport() {
    return channelActivityEventHistoryReport;
  }

  public void setChannelActivityEventHistoryReport(Object channelActivityEventHistoryReport) {
    this.channelActivityEventHistoryReport = channelActivityEventHistoryReport;
  }


}

