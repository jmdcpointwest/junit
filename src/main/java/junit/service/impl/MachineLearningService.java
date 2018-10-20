package junit.service.impl;

import org.springframework.stereotype.Service;

import junit.service.DataModelService;

@Service("ml")
public class MachineLearningService implements DataModelService {

//    @Override
    public boolean isValid(String input) {
        if ("true".equalsIgnoreCase(input)) {
        	return true;
        } else {
        	return false;
        }
    }

}
