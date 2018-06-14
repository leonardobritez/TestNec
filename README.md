# TestNec


En el mapper tambien se podia haber hecho este parseo:


http://www.baeldung.com/jackson-object-mapper-tutorial
________________________________________________________
4.4. Handling Collections
Another small but useful feature available through DeserializationFeature is the ability to generate the type of collection desired from a JSON Array response, e.g. as an array:


String jsonCarArray = 
  "[{ \"color\" : \"Black\", \"type\" : \"BMW\" }, { \"color\" : \"Red\", \"type\" : \"FIAT\" }]";
ObjectMapper objectMapper = new ObjectMapper();
objectMapper.configure(DeserializationFeature.USE_JAVA_ARRAY_FOR_JSON_ARRAY, true);
Car[] cars = objectMapper.readValue(jsonCarArray, Car[].class);
// print cars