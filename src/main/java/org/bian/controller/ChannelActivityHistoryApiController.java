/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Track;

@BianRestController
public class ChannelActivityHistoryApiController {

	@Autowired
	ChannelActivityHistoryApiService service;
	
	@BQ("events")
	@Track.Record
	public BianResponse<EventWithIds> recordEvents(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Event> bianRequest) {
		return BianResponse.forSuccess(service.recordEvents(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Track.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Track.Retrieve
	public BianResponse<LogWithIds> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Track.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Track.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("events")
	@Track.Retrieve
	public BianResponse<EventWithIds> retrieveEvents(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveEvents(crReferenceId, bqReferenceId));
	}
	
	@BQ("events")
	@Track.Update
	public BianResponse<EventWithIds> updateEvents(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<Event> bianRequest) {
		return BianResponse.forSuccess(service.updateEvents(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
