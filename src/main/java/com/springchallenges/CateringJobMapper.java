package com.springchallenges;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;


public class CateringJobMapper implements FieldSetMapper<CateringJob> {
    @Override
    public CateringJob mapFieldSet(FieldSet fieldSet) {
        CateringJob job = new CateringJob();
        job.setId(fieldSet.readLong("id"));
        job.setCustomerName(fieldSet.readString("customerName"));
        job.setPhoneNumber(fieldSet.readString("phoneNumber"));
        job.setEmail(fieldSet.readString("email"));
        job.setMenu(fieldSet.readString("menu"));
        job.setNoOfGuests(fieldSet.readInt("noOfGuests"));
        job.setStatus(Status.valueOf(fieldSet.readString("status")));
        return job;
    }
}
