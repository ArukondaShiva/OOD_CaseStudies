package org.example.personaccountprofilerequestimpl;

import org.example.postmsgcommentsearchjobimpl.Job;

public class Recruiter extends Account{

    public Recruiter(String id, String password, Person person, Account status) {
        super(id, password, person, status);
    }

    public void postJob(Job jobId){

    }

    public void closeJob(Job jobId){

    }

}
