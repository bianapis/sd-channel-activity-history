package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * EventWithIds
 */
public class EventWithIds   {
  private String channelActivityEventRecordReference = null;

  private String customerChannelActivityEventHistoryReference = null;

  private Object channelActivityEventRecord = null;

  private String customerContactRecordReference = null;

  private Object customerContactRecord = null;

  private String customerContactRecordCustomerReference = null;

  private String customerContactRecordMenuSelection = null;

  private String customerContactRecordContactDevice = null;

  private String customerContactRecordAuthenticationLevel = null;

  private Object customerContactRecordContactDialogueRecord = null;

  private String contactDialogueRecordCustomerReference = null;

  private String contactDialogueRecordEmployeeReference = null;

  private String contactDialogueRecordServicingPositionReference = null;

  private String contactDialogueRecordSessionMechanism = null;

  private String contactDialogueRecordSessionStartEndTime = null;

  private String contactDialogueRecordContactDialogueType = null;

  private String contactDialogueRecordContactDialogueScript = null;

  private String contactDialogueRecordContactDialogueLogReference = null;

  private String contactDialogueRecordContactDialogueLog = null;

  private Object customerContactActivityRecord = null;

  private String customerContactFromto = null;

  private String customerContactResult = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return channelActivityEventRecordReference
  **/

  public String getChannelActivityEventRecordReference() {
    return channelActivityEventRecordReference;
  }

  public void setChannelActivityEventRecordReference(String channelActivityEventRecordReference) {
    this.channelActivityEventRecordReference = channelActivityEventRecordReference;
  }


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return channelActivityEventRecord
  **/

  public Object getChannelActivityEventRecord() {
    return channelActivityEventRecord;
  }

  public void setChannelActivityEventRecord(Object channelActivityEventRecord) {
    this.channelActivityEventRecord = channelActivityEventRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return customerContactRecordReference
  **/

  public String getCustomerContactRecordReference() {
    return customerContactRecordReference;
  }

  public void setCustomerContactRecordReference(String customerContactRecordReference) {
    this.customerContactRecordReference = customerContactRecordReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerContactRecord
  **/

  public Object getCustomerContactRecord() {
    return customerContactRecord;
  }

  public void setCustomerContactRecord(Object customerContactRecord) {
    this.customerContactRecord = customerContactRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return customerContactRecordCustomerReference
  **/

  public String getCustomerContactRecordCustomerReference() {
    return customerContactRecordCustomerReference;
  }

  public void setCustomerContactRecordCustomerReference(String customerContactRecordCustomerReference) {
    this.customerContactRecordCustomerReference = customerContactRecordCustomerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactRecordMenuSelection
  **/

  public String getCustomerContactRecordMenuSelection() {
    return customerContactRecordMenuSelection;
  }

  public void setCustomerContactRecordMenuSelection(String customerContactRecordMenuSelection) {
    this.customerContactRecordMenuSelection = customerContactRecordMenuSelection;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactRecordContactDevice
  **/

  public String getCustomerContactRecordContactDevice() {
    return customerContactRecordContactDevice;
  }

  public void setCustomerContactRecordContactDevice(String customerContactRecordContactDevice) {
    this.customerContactRecordContactDevice = customerContactRecordContactDevice;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactRecordAuthenticationLevel
  **/

  public String getCustomerContactRecordAuthenticationLevel() {
    return customerContactRecordAuthenticationLevel;
  }

  public void setCustomerContactRecordAuthenticationLevel(String customerContactRecordAuthenticationLevel) {
    this.customerContactRecordAuthenticationLevel = customerContactRecordAuthenticationLevel;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerContactRecordContactDialogueRecord
  **/

  public Object getCustomerContactRecordContactDialogueRecord() {
    return customerContactRecordContactDialogueRecord;
  }

  public void setCustomerContactRecordContactDialogueRecord(Object customerContactRecordContactDialogueRecord) {
    this.customerContactRecordContactDialogueRecord = customerContactRecordContactDialogueRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return contactDialogueRecordCustomerReference
  **/

  public String getContactDialogueRecordCustomerReference() {
    return contactDialogueRecordCustomerReference;
  }

  public void setContactDialogueRecordCustomerReference(String contactDialogueRecordCustomerReference) {
    this.contactDialogueRecordCustomerReference = contactDialogueRecordCustomerReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return contactDialogueRecordEmployeeReference
  **/

  public String getContactDialogueRecordEmployeeReference() {
    return contactDialogueRecordEmployeeReference;
  }

  public void setContactDialogueRecordEmployeeReference(String contactDialogueRecordEmployeeReference) {
    this.contactDialogueRecordEmployeeReference = contactDialogueRecordEmployeeReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return contactDialogueRecordServicingPositionReference
  **/

  public String getContactDialogueRecordServicingPositionReference() {
    return contactDialogueRecordServicingPositionReference;
  }

  public void setContactDialogueRecordServicingPositionReference(String contactDialogueRecordServicingPositionReference) {
    this.contactDialogueRecordServicingPositionReference = contactDialogueRecordServicingPositionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueRecordSessionMechanism
  **/

  public String getContactDialogueRecordSessionMechanism() {
    return contactDialogueRecordSessionMechanism;
  }

  public void setContactDialogueRecordSessionMechanism(String contactDialogueRecordSessionMechanism) {
    this.contactDialogueRecordSessionMechanism = contactDialogueRecordSessionMechanism;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueRecordSessionStartEndTime
  **/

  public String getContactDialogueRecordSessionStartEndTime() {
    return contactDialogueRecordSessionStartEndTime;
  }

  public void setContactDialogueRecordSessionStartEndTime(String contactDialogueRecordSessionStartEndTime) {
    this.contactDialogueRecordSessionStartEndTime = contactDialogueRecordSessionStartEndTime;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueRecordContactDialogueType
  **/

  public String getContactDialogueRecordContactDialogueType() {
    return contactDialogueRecordContactDialogueType;
  }

  public void setContactDialogueRecordContactDialogueType(String contactDialogueRecordContactDialogueType) {
    this.contactDialogueRecordContactDialogueType = contactDialogueRecordContactDialogueType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueRecordContactDialogueScript
  **/

  public String getContactDialogueRecordContactDialogueScript() {
    return contactDialogueRecordContactDialogueScript;
  }

  public void setContactDialogueRecordContactDialogueScript(String contactDialogueRecordContactDialogueScript) {
    this.contactDialogueRecordContactDialogueScript = contactDialogueRecordContactDialogueScript;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return contactDialogueRecordContactDialogueLogReference
  **/

  public String getContactDialogueRecordContactDialogueLogReference() {
    return contactDialogueRecordContactDialogueLogReference;
  }

  public void setContactDialogueRecordContactDialogueLogReference(String contactDialogueRecordContactDialogueLogReference) {
    this.contactDialogueRecordContactDialogueLogReference = contactDialogueRecordContactDialogueLogReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return contactDialogueRecordContactDialogueLog
  **/

  public String getContactDialogueRecordContactDialogueLog() {
    return contactDialogueRecordContactDialogueLog;
  }

  public void setContactDialogueRecordContactDialogueLog(String contactDialogueRecordContactDialogueLog) {
    this.contactDialogueRecordContactDialogueLog = contactDialogueRecordContactDialogueLog;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary 
   * @return customerContactActivityRecord
  **/

  public Object getCustomerContactActivityRecord() {
    return customerContactActivityRecord;
  }

  public void setCustomerContactActivityRecord(Object customerContactActivityRecord) {
    this.customerContactActivityRecord = customerContactActivityRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactFromto
  **/

  public String getCustomerContactFromto() {
    return customerContactFromto;
  }

  public void setCustomerContactFromto(String customerContactFromto) {
    this.customerContactFromto = customerContactFromto;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return customerContactResult
  **/

  public String getCustomerContactResult() {
    return customerContactResult;
  }

  public void setCustomerContactResult(String customerContactResult) {
    this.customerContactResult = customerContactResult;
  }


}

