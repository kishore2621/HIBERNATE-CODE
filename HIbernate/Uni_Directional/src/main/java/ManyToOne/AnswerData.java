package ManyToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AnswerData 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String answer;
	private String answerby;
	@ManyToOne(cascade = CascadeType.ALL)
	private QuestionData data;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getAnswerby() {
		return answerby;
	}
	public void setAnswerby(String answerby) {
		this.answerby = answerby;
	}
	public QuestionData getData() {
		return data;
	}
	public void setData(QuestionData data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "AnswerData [id=" + id + ", answer=" + answer + ", answerby=" + answerby + "]";
	}
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
