/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class ChannelActivityHistoryApiServiceImpl implements ChannelActivityHistoryApiService {

	public EventWithIds recordEvents(String crReferenceId, String bqReferenceId, Event request){
		return JsonReader.read("record-EventWithIds.json",new TypeReference<EventWithIds>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public LogWithIds retrieve(String crReferenceId){
		return JsonReader.read("retrieve-LogWithIds.json",new TypeReference<LogWithIds>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public EventWithIds retrieveEvents(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-EventWithIds.json",new TypeReference<EventWithIds>(){});
	}
	
	public EventWithIds updateEvents(String crReferenceId, String bqReferenceId, Event request){
		return JsonReader.read("update-EventWithIds.json",new TypeReference<EventWithIds>(){});
	}
	
}
