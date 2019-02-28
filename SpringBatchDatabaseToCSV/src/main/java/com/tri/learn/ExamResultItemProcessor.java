package com.tri.learn;

import org.springframework.batch.item.ItemProcessor;

import com.tri.learn.model.DWNotifAttempt;
 
public class ExamResultItemProcessor implements ItemProcessor<DWNotifAttempt, DWNotifAttempt>{
 
    @Override
    public DWNotifAttempt process(DWNotifAttempt result) throws Exception {
        System.out.println("Processing result :"+result);
 
        /*
         * Only return results which are equal or more than 80%
         *
         */
        /*if(result.getPercentage() < 80){
            return null;
        }*/
 
        return result;
    }
 
}

