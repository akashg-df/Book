package com.dream.filler.tracker.config;



import org.springframework.context.annotation.Configuration;




@Configuration
public class FireBaseInitializer {

//	@Value("${app.firebase-configuration-file}")
//	private String firebaseConfigPath;
//
//	@PostConstruct
//	public void initialize() {
//		try {
//			FirebaseOptions options = new FirebaseOptions.Builder()
//					.setCredentials(
//							GoogleCredentials.fromStream(new ClassPathResource(firebaseConfigPath).getInputStream()))
//					.build();
//			if (FirebaseApp.getApps().isEmpty()) {
//				FirebaseApp.initializeApp(options);
//				log.info("Firebase application has been initialized");
//			}
//		} catch (IOException e) {
//			log.error(e.getMessage());
//		}
//
//	}

}
