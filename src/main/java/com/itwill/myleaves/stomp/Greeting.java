package com.itwill.myleaves.stomp;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Greeting {
	
	private String id;
    private String content;

}
