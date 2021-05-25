package com.example.feignbackend;

import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.feignclient.SpaceStation;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StatusController {

	private final SpaceStationClient spaceStationClient;

	@GetMapping("/status")
	public SpaceStation status() {
		return spaceStationClient.findSpaceStation(new Random().nextInt());

	}
}
