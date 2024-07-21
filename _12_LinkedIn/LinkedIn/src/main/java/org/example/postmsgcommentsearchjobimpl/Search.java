package org.example.postmsgcommentsearchjobimpl;

import org.example.personaccountprofilerequestimpl.Account;

import java.time.LocalDateTime;
import java.util.ArrayList;

public interface Search {

    public ArrayList<Account> searchAccount(String name);

    public ArrayList<Job> searchPost(Job jobId);


}
