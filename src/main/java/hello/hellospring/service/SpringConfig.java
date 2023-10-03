package hello.hellospring.service;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {
//    private DataSource dataSource;
//    private final EntityManager em;

    private final MemberRepository memberRepository;

@Autowired
    public SpringConfig(DataSource dataSource, EntityManager em, MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
//    this.dataSource = dataSource;
//    this.em = em;
}

    @Bean
    public MemberService memberService(){
        return  new MemberService(memberRepository);
    }
    @Bean
    public static TimeTraceAop timeTraceAop(){
        return new TimeTraceAop();
    }

//    @Bean
//    public MemberRepository memberRepository(){
//        return  new MemoryMemberRepository();
//        return  new JdbcMemberRepository(dataSource);
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
}
