

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {
		Resource res=new ClassPathResource("myconfig.xml");
		BeanFactory fact=new XmlBeanFactory(res);
		StudentBean wb1=(StudentBean)fact.getBean("sb1");
		wb1.printStudent();
		
	}

}
