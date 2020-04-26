package com.hyungeun.app;

import com.hyungeun.app.entity.*;
import com.hyungeun.app.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication implements CommandLineRunner {

	private final PersonRepository personRepository;
	private final SocialMediaRepository socialMediaRepository;
	private final InterestsRepository interestsRepository;
	private final SkillRepository skillRepository;
	private final WorkRepository workRepository;

	public AppApplication(PersonRepository personRepository, SocialMediaRepository socialMediaRepository, InterestsRepository interestsRepository, SkillRepository skillRepository, WorkRepository workRepository) {
		this.personRepository = personRepository;
		this.socialMediaRepository = socialMediaRepository;
		this.interestsRepository = interestsRepository;
		this.skillRepository = skillRepository;
		this.workRepository = workRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		personRepository.save(new Person("박현근", "백엔드", "hello@test.com", "010-1234-5678"));
		socialMediaRepository.save(new SocialMedia("anonymous",  null, "anonymous", null));
		interestsRepository.save(new Interests("스포츠 관람"));
		interestsRepository.save(new Interests("드라마 시청"));
		skillRepository.save(new Skill("Java", 75));
		skillRepository.save(new Skill("MySql", 50));
		workRepository.save(new Work("Presenter", "Mcdonald", "1년", "패스트 푸드 점에서 일 했습니다."));
		workRepository.save(new Work("Presenter", "Mcdonald", "1년", "패스트 푸드 점에서 일 했습니다."));
		workRepository.save(new Work("Presenter", "Mcdonald", "1년", "패스트 푸드 점에서 일 했습니다."));
		workRepository.save(new Work("Presenter", "Mcdonald", "1년", "패스트 푸드 점에서 일 했습니다."));
	}
}
