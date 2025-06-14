package com.bank.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "com.bank")
@EnableJpaRepositories("com.bank.repository")
public class BankConfig {
	@Bean
	public InternalResourceViewResolver viewResolverBean() {
		InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
		viewResolver.setPrefix("/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}
	@Bean(name="entityManagerFactory")
	public LocalEntityManagerFactoryBean localEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean localEntityManagerFactoryBean=new LocalEntityManagerFactoryBean();
		localEntityManagerFactoryBean.setPersistenceUnitName("Bank_Management_System");
		return localEntityManagerFactoryBean;
	}
	@Bean(name="transactionManager")
	public JpaTransactionManager jpaTransactionManagerBean(EntityManagerFactory emf) {
		JpaTransactionManager jpaTransactionManager=new JpaTransactionManager();
		jpaTransactionManager.setEntityManagerFactory(emf);
		return jpaTransactionManager;

	}
}
