package team.dexter.CodeReviewerCommons.dtos;

public class FeedbackDto {

	private String feedbackBy;
	private String comment;

	public String getFeedbackBy() {
		return feedbackBy;
	}

	public void setFeedbackBy(String feebackBy) {
		this.feedbackBy = feebackBy;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
