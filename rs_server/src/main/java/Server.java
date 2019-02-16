import com.zhang.service.UserServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class Server {
    public static void main(String[] args)
    {

        JAXRSServerFactoryBean factoryBean = new JAXRSServerFactoryBean();
        factoryBean.setAddress("http://localhost/rs/hello");
        factoryBean.setServiceBean(new UserServiceImpl());
        factoryBean.create();
    }
}
