import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {
	public static void main(String[] args) {
		
		
		//spring has 2 containers we have , BeanFactory (lazy), application context(Eager): dependency injection module we can say
		//core module
		//object created by the spring container
		
		Resource resource= new ClassPathResource("springConfig.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
	               Employee emp= (Employee) factory.getBean("employee");
	               System.out.println(emp);
		
	}

}
