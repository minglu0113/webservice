import com.zhang.bean.Car;
import com.zhang.bean.User;
import org.apache.cxf.jaxrs.client.WebClient;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args)
    {
        Car car = new Car(001,"baoma",12.0);
        List<Car> cars = new ArrayList<Car>();
        cars.add(car);
//        WebClient.create("http://localhost/rs/hello/userService/user")
//                 .post(new User(12,"zhangluming","shanghai",cars));
         User user = WebClient.create("http://localhost/rs/hello/userService/user/2")
                .get(User.class);
        System.out.println(user);
    }
}
