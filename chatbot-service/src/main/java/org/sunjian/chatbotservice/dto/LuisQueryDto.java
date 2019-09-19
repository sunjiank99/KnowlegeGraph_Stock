/**
  * Copyright 2019 bejson.com 
  */
package org.sunjian.chatbotservice.dto;
import java.io.Serializable;
import java.util.List;

/**
 * Auto-generated: 2019-09-19 17:29:31
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class LuisQueryDto implements Serializable {

    private String query;
    private TopScoringIntent topScoringIntent;
    private List<Intents> intents;
    private List<Entities> entities;
    public void setQuery(String query) {
         this.query = query;
     }
     public String getQuery() {
         return query;
     }

    public void setTopScoringIntent(TopScoringIntent topScoringIntent) {
         this.topScoringIntent = topScoringIntent;
     }
     public TopScoringIntent getTopScoringIntent() {
         return topScoringIntent;
     }

    public void setIntents(List<Intents> intents) {
         this.intents = intents;
     }
     public List<Intents> getIntents() {
         return intents;
     }

    public void setEntities(List<Entities> entities) {
         this.entities = entities;
     }
     public List<Entities> getEntities() {
         return entities;
     }

}