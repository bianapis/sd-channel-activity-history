/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface ChannelActivityHistoryApiService {

	EventWithIds recordEvents(String crReferenceId, String bqReferenceId, Event request);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	LogWithIds retrieve(String crReferenceId);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	EventWithIds retrieveEvents(String crReferenceId, String bqReferenceId);
	
	EventWithIds updateEvents(String crReferenceId, String bqReferenceId, Event request);
	
}
