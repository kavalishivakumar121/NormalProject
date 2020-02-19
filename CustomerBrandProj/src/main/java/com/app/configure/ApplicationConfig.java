package com.app.configure;

import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.app.model.CustomerDetails;
import com.app.model.ProductBrand;

@Configuration
@ComponentScan(basePackages ="com.app")
@PropertySource("classpath:app.properties")
@EnableWebMvc
@EnableTransactionManagement
public class ApplicationConfig {
	@Autowired
	private Environment env;
	@Bean	//DataBase connection properties
	public BasicDataSource ds()
	{
		BasicDataSource b=new BasicDataSource();
		b.setDriverClassName(env.getProperty("dc"));
		b.setUrl(env.getProperty("url"));
		b.setUsername(env.getProperty("un"));
		b.setPassword(env.getProperty("pwd"));
		
		return b;
	}
	@Bean	//SessionFactory
	public LocalSessionFactoryBean lsf()
	{
		LocalSessionFactoryBean ls=new LocalSessionFactoryBean();
		ls.setDataSource(ds());
		ls.setHibernateProperties(props());
		ls.setAnnotatedClasses(ProductBrand.class,CustomerDetails.class);
		return ls;
	}
	@Bean	//Hibernate properties
	public Properties props()
	{
		Properties p=new Properties();
		p.put("hibernate.dialect",env.getProperty("dialect"));
		p.put("hibernate.show_sql",env.getProperty("ssql"));
		p.put("hibernate.format_sql", env.getProperty("fsql"));
		p.put("hibernate.hbm2ddl.auto",env.getProperty("ddl"));
		
		return p;
	}
	@Bean //hibernate template
	public HibernateTemplate ht()
	{
		HibernateTemplate h=new HibernateTemplate();
		h.setSessionFactory(lsf().getObject());
		return h;
	}
	@Bean 	//Hibernate Transaction
	public HibernateTransactionManager htm()
	{
		HibernateTransactionManager hr=new HibernateTransactionManager();
		hr.setSessionFactory(lsf().getObject());
		return hr;
	}
	@Bean	//MVC Properties
	public InternalResourceViewResolver ivr()
	{
		InternalResourceViewResolver ir=new InternalResourceViewResolver();
		ir.setPrefix(env.getProperty("prefix"));
		ir.setSuffix(env.getProperty("suffix"));
		return ir;
	}
}
