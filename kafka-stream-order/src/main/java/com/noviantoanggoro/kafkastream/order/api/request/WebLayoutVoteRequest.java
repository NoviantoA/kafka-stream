package com.noviantoanggoro.kafkastream.order.api.request;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class WebLayoutVoteRequest {

	private String layout;

	private String username;

	@JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	private LocalDateTime voteDateTime;

	public String getLayout() {
		return layout;
	}

	public String getUsername() {
		return username;
	}

	public LocalDateTime getVoteDateTime() {
		return voteDateTime;
	}

	public void setLayout(String layout) {
		this.layout = layout;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setVoteDateTime(LocalDateTime voteDateTime) {
		this.voteDateTime = voteDateTime;
	}

	@Override
	public String toString() {
		return "WebLayoutVoteRequest [layout=" + layout + ", username=" + username + ", voteDateTime=" + voteDateTime
				+ "]";
	}

}
