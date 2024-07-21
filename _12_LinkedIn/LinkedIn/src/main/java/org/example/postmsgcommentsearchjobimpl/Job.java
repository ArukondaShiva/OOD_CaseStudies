package org.example.postmsgcommentsearchjobimpl;

import java.time.LocalDateTime;

public class Job {

    private String jobId;
    private String description;
    private String companyName;
    private LocalDateTime lastDate;


    public Job(String jobId, String description, String companyName, LocalDateTime lastDate) {
        this.jobId = jobId;
        this.description = description;
        this.companyName = companyName;
        this.lastDate = lastDate;
    }
}
