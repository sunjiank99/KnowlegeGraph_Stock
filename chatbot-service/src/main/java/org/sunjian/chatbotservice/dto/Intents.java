/**
  * Copyright 2019 bejson.com 
  */
package org.sunjian.chatbotservice.dto;

/**
 * Auto-generated: 2019-09-19 17:29:31
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Intents {

    private String intent;
    private double score;
    public void setIntent(String intent) {
         this.intent = intent;
     }
     public String getIntent() {
         return intent;
     }

    public void setScore(double score) {
         this.score = score;
     }
     public double getScore() {
         return score;
     }

}