# Spock_Testing

Proyecto con la finalidad de enseñar la configuración para poder lanzar spock (framework de testing en groovy) desde maven y enseñarlo sobre un proyecto funcional de el 

Gracias a <a href="https://www.softwaretestinghelp.com/spock-and-groovy/">esta página</a> he podido configurar el spock para que los test corran en un `mvn test`

```
<!-- Spock support for Maven -->
<plugin>
	<groupId>org.codehaus.gmavenplus</groupId>
	<artifactId>gmavenplus-plugin</artifactId>
	<version>1.13.1</version>
	<executions>
		<execution>
			<goals>
				<goal>compileTests</goal>
			</goals>
		</execution>
	</executions>
</plugin>
<plugin>
	<groupId>org.apache.maven.plugins</groupId>
	<artifactId>maven-surefire-plugin</artifactId>
	<configuration>
		<includes>
			<!-- Por defecto solo los archivos acabados en 'Test' serán tomados en cuenta
			por lo tanto hay que añadir el soporte para los test de groovy acabados en Spec 
			aunque los archivos sean .groovy en el include se pone .java
			debido a una transpilación de groovy a java -->
			<include>**/*Test.java</include>
			<include>**/*Spec.java</include>
		</includes>
	</configuration>
</plugin>
```

Adicionalmente <a href="https://stackoverflow.com/questions/25186004/running-spock-unit-tests-with-maven">esta pregunta</a> en stackoverflow muestra en teoría como hacer que eclipse pueda ejecutar groovy aunque en mi caso no me ha funcionado