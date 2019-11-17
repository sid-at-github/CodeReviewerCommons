package team.dexter.CodeReviewerCommons.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RevieweeCodeDto {

	private String id;
	private String username;
	private String title;
	private String code;
	private List<String> tags;
	private List<FeedbackDto> feedbacks;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public List<FeedbackDto> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(List<FeedbackDto> feedbacks) {
		this.feedbacks = feedbacks;
	}

}
