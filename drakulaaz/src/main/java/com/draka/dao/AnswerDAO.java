package com.draka.dao;


  
import java.util.List;  
  
import com.draka.domain.Answer;  
  
/** 
 * @author Dinesh Rajput 
 * 
 */  
public interface AnswerDAO {  
 Answer getByAnswer_ID(int Answer_ID);  
   
 List<Answer> getAllAnswer();  
   
 int save(Answer answer);  
   
 void update(Answer answer);  
   
 void view(Answer answer);  
   
 void delete(int Answer_ID);  
}