package MyPack;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Jobs {

	private int srNo;
	private String jobType;
	private Map<String, String> jobs;
	
	public Jobs() {
		super();
	}

	public int getSrNo() {
		return srNo;
	}

	public void setSrNo(int srNo) {
		this.srNo = srNo;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public Map<String, String> getJobs() {
		return jobs;
	}

	public void setJobs(Map<String, String> jobs) {
		this.jobs = jobs;
	}
	
	public void JobInfo(){
		
		System.out.println(srNo+" "+jobType);
		System.out.println("Available Jobs...");
		
		Set<Entry<String, String>> set = jobs.entrySet();
		
		Iterator<Entry<String, String>> itr = set.iterator();
		while(itr.hasNext()){
			
			Entry<String, String> entry = itr.next();
			System.out.println("Job Name : "+entry.getKey()+" "+"Posted By : "+entry.getValue());
		}
	}
}
