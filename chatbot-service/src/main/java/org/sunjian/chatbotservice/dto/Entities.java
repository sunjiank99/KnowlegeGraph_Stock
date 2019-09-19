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
public class Entities {

    private String entity;
    private String type;
    private int startIndex;
    private int endIndex;
    private Resolution resolution;
    public void setEntity(String entity) {
         this.entity = entity;
     }
     public String getEntity() {
         return entity;
     }

    public void setType(String type) {
         this.type = type;
     }
     public String getType() {
         return type;
     }

    public void setStartIndex(int startIndex) {
         this.startIndex = startIndex;
     }
     public int getStartIndex() {
         return startIndex;
     }

    public void setEndIndex(int endIndex) {
         this.endIndex = endIndex;
     }
     public int getEndIndex() {
         return endIndex;
     }

    public void setResolution(Resolution resolution) {
         this.resolution = resolution;
     }
     public Resolution getResolution() {
         return resolution;
     }

}