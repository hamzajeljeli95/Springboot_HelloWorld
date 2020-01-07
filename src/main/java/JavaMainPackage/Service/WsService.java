package JavaMainPackage.Service;

import JavaMainPackage.DAO.WsDao;
import JavaMainPackage.DAO.WsDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WsService {
    WsDao dao=new WsDaoImpl();
    public String sayHello() {
        return dao.sayHello();
    }
}
