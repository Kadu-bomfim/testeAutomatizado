package converter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataConverter {

    public Object getDataConverter(Class classe, String dados) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Object objeto = mapper.readValue(dados, classe);
        return objeto;
    }
}
