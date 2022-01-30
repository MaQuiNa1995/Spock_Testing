package com.github.maquina1995.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Food {

	private Long id;
	private String name;
	private Integer hunger;
	private Integer sanity;
	private Integer life;
}
