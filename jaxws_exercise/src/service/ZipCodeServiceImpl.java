package service;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Berwyn Codeweaver
 * Date: 06/08/13
 * Time: 17:53
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "service.ZipCodeService", serviceName = "ZipCodeService")
public class ZipCodeServiceImpl implements ZipCodeService {

    private static final Map<Integer, State> STATES;

    static {
        STATES = new HashMap<>();
        STATES.put(84102, new State("Utah", "UT"));
    }

    @Override
    public State getState(Integer zipcode) {
        return STATES.get(zipcode);
    }

    @Override
    public void addZipcode(State state, List<Integer> zipcodes) {
        for (Integer zipcode : zipcodes) {
            if (STATES.containsKey(zipcode)) continue;
            STATES.put(zipcode, state);
        }
    }
}
