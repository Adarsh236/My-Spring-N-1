package spring.MyFirstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstSpringApplication.class, args);
	}}

/////////////// my console error////////////////////
/*
* "C:\Program Files\Java\jdk-11.0.5\bin\java.exe" -XX:TieredStopAtLevel=1 -noverify -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true "-javaagent:C:\Program Files\My-Softwares\JetBrains 2020-2-6\InteliJ IDEA 2019.3.2\IntelliJ IDEA 2019.3.2\lib\idea_rt.jar=55217:C:\Program Files\My-Softwares\JetBrains 2020-2-6\InteliJ IDEA 2019.3.2\IntelliJ IDEA 2019.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\Adarsh\OneDrive\Desktop\Working-2\My-Spring-N-1\Spring-1\MyFirstSpring\target\classes;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-data-jpa\2.2.4.RELEASE\spring-boot-starter-data-jpa-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-aop\2.2.4.RELEASE\spring-boot-starter-aop-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-aop\5.2.3.RELEASE\spring-aop-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\aspectj\aspectjweaver\1.9.5\aspectjweaver-1.9.5.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-jdbc\2.2.4.RELEASE\spring-boot-starter-jdbc-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\com\zaxxer\HikariCP\3.4.2\HikariCP-3.4.2.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-jdbc\5.2.3.RELEASE\spring-jdbc-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\jakarta\activation\jakarta.activation-api\1.2.1\jakarta.activation-api-1.2.1.jar;C:\Users\Adarsh\.m2\repository\jakarta\persistence\jakarta.persistence-api\2.2.3\jakarta.persistence-api-2.2.3.jar;C:\Users\Adarsh\.m2\repository\jakarta\transaction\jakarta.transaction-api\1.3.3\jakarta.transaction-api-1.3.3.jar;C:\Users\Adarsh\.m2\repository\org\hibernate\hibernate-core\5.4.10.Final\hibernate-core-5.4.10.Final.jar;C:\Users\Adarsh\.m2\repository\org\jboss\logging\jboss-logging\3.4.1.Final\jboss-logging-3.4.1.Final.jar;C:\Users\Adarsh\.m2\repository\org\javassist\javassist\3.24.0-GA\javassist-3.24.0-GA.jar;C:\Users\Adarsh\.m2\repository\net\bytebuddy\byte-buddy\1.10.6\byte-buddy-1.10.6.jar;C:\Users\Adarsh\.m2\repository\antlr\antlr\2.7.7\antlr-2.7.7.jar;C:\Users\Adarsh\.m2\repository\org\jboss\jandex\2.1.1.Final\jandex-2.1.1.Final.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\classmate\1.5.1\classmate-1.5.1.jar;C:\Users\Adarsh\.m2\repository\org\dom4j\dom4j\2.1.1\dom4j-2.1.1.jar;C:\Users\Adarsh\.m2\repository\org\hibernate\common\hibernate-commons-annotations\5.1.0.Final\hibernate-commons-annotations-5.1.0.Final.jar;C:\Users\Adarsh\.m2\repository\org\glassfish\jaxb\jaxb-runtime\2.3.2\jaxb-runtime-2.3.2.jar;C:\Users\Adarsh\.m2\repository\org\glassfish\jaxb\txw2\2.3.2\txw2-2.3.2.jar;C:\Users\Adarsh\.m2\repository\com\sun\istack\istack-commons-runtime\3.0.8\istack-commons-runtime-3.0.8.jar;C:\Users\Adarsh\.m2\repository\org\jvnet\staxex\stax-ex\1.8.1\stax-ex-1.8.1.jar;C:\Users\Adarsh\.m2\repository\com\sun\xml\fastinfoset\FastInfoset\1.2.16\FastInfoset-1.2.16.jar;C:\Users\Adarsh\.m2\repository\org\springframework\data\spring-data-jpa\2.2.4.RELEASE\spring-data-jpa-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\data\spring-data-commons\2.2.4.RELEASE\spring-data-commons-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-orm\5.2.3.RELEASE\spring-orm-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-context\5.2.3.RELEASE\spring-context-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-tx\5.2.3.RELEASE\spring-tx-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-beans\5.2.3.RELEASE\spring-beans-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\slf4j\slf4j-api\1.7.30\slf4j-api-1.7.30.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-aspects\5.2.3.RELEASE\spring-aspects-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.2.4.RELEASE\spring-boot-starter-web-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter\2.2.4.RELEASE\spring-boot-starter-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot\2.2.4.RELEASE\spring-boot-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-autoconfigure\2.2.4.RELEASE\spring-boot-autoconfigure-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-logging\2.2.4.RELEASE\spring-boot-starter-logging-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\ch\qos\logback\logback-classic\1.2.3\logback-classic-1.2.3.jar;C:\Users\Adarsh\.m2\repository\ch\qos\logback\logback-core\1.2.3\logback-core-1.2.3.jar;C:\Users\Adarsh\.m2\repository\org\apache\logging\log4j\log4j-to-slf4j\2.12.1\log4j-to-slf4j-2.12.1.jar;C:\Users\Adarsh\.m2\repository\org\apache\logging\log4j\log4j-api\2.12.1\log4j-api-2.12.1.jar;C:\Users\Adarsh\.m2\repository\org\slf4j\jul-to-slf4j\1.7.30\jul-to-slf4j-1.7.30.jar;C:\Users\Adarsh\.m2\repository\jakarta\annotation\jakarta.annotation-api\1.3.5\jakarta.annotation-api-1.3.5.jar;C:\Users\Adarsh\.m2\repository\org\yaml\snakeyaml\1.25\snakeyaml-1.25.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-json\2.2.4.RELEASE\spring-boot-starter-json-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\core\jackson-databind\2.10.2\jackson-databind-2.10.2.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\core\jackson-annotations\2.10.2\jackson-annotations-2.10.2.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\core\jackson-core\2.10.2\jackson-core-2.10.2.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jdk8\2.10.2\jackson-datatype-jdk8-2.10.2.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\datatype\jackson-datatype-jsr310\2.10.2\jackson-datatype-jsr310-2.10.2.jar;C:\Users\Adarsh\.m2\repository\com\fasterxml\jackson\module\jackson-module-parameter-names\2.10.2\jackson-module-parameter-names-2.10.2.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-tomcat\2.2.4.RELEASE\spring-boot-starter-tomcat-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\apache\tomcat\embed\tomcat-embed-core\9.0.30\tomcat-embed-core-9.0.30.jar;C:\Users\Adarsh\.m2\repository\org\apache\tomcat\embed\tomcat-embed-el\9.0.30\tomcat-embed-el-9.0.30.jar;C:\Users\Adarsh\.m2\repository\org\apache\tomcat\embed\tomcat-embed-websocket\9.0.30\tomcat-embed-websocket-9.0.30.jar;C:\Users\Adarsh\.m2\repository\org\springframework\boot\spring-boot-starter-validation\2.2.4.RELEASE\spring-boot-starter-validation-2.2.4.RELEASE.jar;C:\Users\Adarsh\.m2\repository\jakarta\validation\jakarta.validation-api\2.0.2\jakarta.validation-api-2.0.2.jar;C:\Users\Adarsh\.m2\repository\org\hibernate\validator\hibernate-validator\6.0.18.Final\hibernate-validator-6.0.18.Final.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-web\5.2.3.RELEASE\spring-web-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-webmvc\5.2.3.RELEASE\spring-webmvc-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-expression\5.2.3.RELEASE\spring-expression-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\com\h2database\h2\1.4.200\h2-1.4.200.jar;C:\Users\Adarsh\.m2\repository\jakarta\xml\bind\jakarta.xml.bind-api\2.3.2\jakarta.xml.bind-api-2.3.2.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-core\5.2.3.RELEASE\spring-core-5.2.3.RELEASE.jar;C:\Users\Adarsh\.m2\repository\org\springframework\spring-jcl\5.2.3.RELEASE\spring-jcl-5.2.3.RELEASE.jar spring.MyFirstSpring.MyFirstSpringApplication

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.2.4.RELEASE)

2020-02-10 06:13:49.674  INFO 3052 --- [           main] s.M.MyFirstSpringApplication             : Starting MyFirstSpringApplication on DESKTOP-SPHTKTS with PID 3052 (C:\Users\Adarsh\OneDrive\Desktop\Working-2\My-Spring-N-1\Spring-1\MyFirstSpring\target\classes started by Adarsh in C:\Users\Adarsh\OneDrive\Desktop\Working-2\My-Spring-N-1\Spring-1\MyFirstSpring)
2020-02-10 06:13:49.681  INFO 3052 --- [           main] s.M.MyFirstSpringApplication             : No active profile set, falling back to default profiles: default
2020-02-10 06:13:50.492  INFO 3052 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2020-02-10 06:13:50.582  INFO 3052 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 78ms. Found 3 JPA repository interfaces.
2020-02-10 06:13:50.866  INFO 3052 --- [           main] trationDelegate$BeanPostProcessorChecker : Bean 'org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration' of type [org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
2020-02-10 06:13:51.121  INFO 3052 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2020-02-10 06:13:51.130  INFO 3052 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-02-10 06:13:51.131  INFO 3052 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.30]
2020-02-10 06:13:51.268  INFO 3052 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-02-10 06:13:51.268  INFO 3052 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 1525 ms
2020-02-10 06:13:51.302  INFO 3052 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-02-10 06:13:51.444  INFO 3052 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-02-10 06:13:51.450  INFO 3052 --- [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:testdb'
2020-02-10 06:13:51.604  INFO 3052 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-02-10 06:13:51.701  INFO 3052 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate Core {5.4.10.Final}
2020-02-10 06:13:51.830  INFO 3052 --- [           main] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-02-10 06:13:51.942  INFO 3052 --- [           main] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.H2Dialect
2020-02-10 06:13:52.093  WARN 3052 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Invocation of init method failed; nested exception is org.hibernate.AnnotationException: @OneToOne or @ManyToOne on spring.MyFirstSpring.Model.Book.publisher references an unknown entity: spring.MyFirstSpring.Model.Publisher
2020-02-10 06:13:52.093  INFO 3052 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2020-02-10 06:13:52.100  INFO 3052 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2020-02-10 06:13:52.103  INFO 3052 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2020-02-10 06:13:52.114  INFO 3052 --- [           main] ConditionEvaluationReportLoggingListener :

Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
2020-02-10 06:13:52.125 ERROR 3052 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Invocation of init method failed; nested exception is org.hibernate.AnnotationException: @OneToOne or @ManyToOne on spring.MyFirstSpring.Model.Book.publisher references an unknown entity: spring.MyFirstSpring.Model.Publisher
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1796) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:595) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:517) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:323) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:222) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:321) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:202) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1108) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:868) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:550) ~[spring-context-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:141) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:747) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:397) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:315) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1226) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1215) ~[spring-boot-2.2.4.RELEASE.jar:2.2.4.RELEASE]
	at spring.MyFirstSpring.MyFirstSpringApplication.main(MyFirstSpringApplication.java:10) ~[classes/:na]
Caused by: org.hibernate.AnnotationException: @OneToOne or @ManyToOne on spring.MyFirstSpring.Model.Book.publisher references an unknown entity: spring.MyFirstSpring.Model.Publisher
	at org.hibernate.cfg.ToOneFkSecondPass.doSecondPass(ToOneFkSecondPass.java:97) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.processEndOfQueue(InFlightMetadataCollectorImpl.java:1814) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.processFkSecondPassesInOrder(InFlightMetadataCollectorImpl.java:1758) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.processSecondPasses(InFlightMetadataCollectorImpl.java:1646) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:286) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1202) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1233) ~[hibernate-core-5.4.10.Final.jar:5.4.10.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58) ~[spring-orm-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) ~[spring-orm-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:391) ~[spring-orm-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:378) ~[spring-orm-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) ~[spring-orm-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1855) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1792) ~[spring-beans-5.2.3.RELEASE.jar:5.2.3.RELEASE]
	... 16 common frames omitted


Process finished with exit code 1
* */