package mx.com.notionsecrets.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.notionsecrets.configsecrets.NotionConfigProperties;

@RestController
@RequestMapping("/notion")
public class NotionController {

	private final NotionConfigProperties notionConfig;
	
	public NotionController(NotionConfigProperties notionConfig) {
		this.notionConfig = notionConfig;
	}
	
	@GetMapping
	public Map<String, String> printAllProps() {
		return Map.of("apiurl", notionConfig.apiUrl(),
				"apiVersion", notionConfig.apiVersion(),
				"authToken", notionConfig.authToken(),
				"databaseId", notionConfig.databaseId());
	}
}
