package com.campers.camfp.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BoardDTO {

	private Long bno;
	private String title;
	private String content;
	private Long mno;		 
	private String nickname;
	private String category;
	private int count;
	private int heart;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	
}
