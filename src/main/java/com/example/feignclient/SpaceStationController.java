package com.example.feignclient;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpaceStationController {
	@GetMapping("/station/{stationId}")
	public SpaceStation getSpaceStation(@PathVariable final Integer stationId) {
		return new SpaceStation(stationId, "my huge spacestation for research purpoose", new Random().nextInt(),
				new Random().nextInt());
	}
}
