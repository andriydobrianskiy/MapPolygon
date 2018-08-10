package webapp;

import org.hsqldb.lib.StringUtil;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class MapEJB {
    @PersistenceContext(unitName = "mapPolygon")
  private EntityManager entityManager;
public Boolean checkMap (String latitude, String longitude, String name){
    if (StringUtil.isEmpty(latitude) || StringUtil.isEmpty(longitude)|| StringUtil.isEmpty(name)){
        return false;
    }
    return true;
}


}
