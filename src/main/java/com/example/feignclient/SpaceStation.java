package com.example.feignclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceStation {
	private Integer id;
	private String name;
	private Integer people;
	private Integer diameter;

}
